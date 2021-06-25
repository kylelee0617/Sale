package com.fg.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

/**
 * Controller收到的請求主體及呼叫方收到的回應主體，分別是由「HttpServletRequest」與「HttpServletResponse」的「InputStream」、「OuputStream」轉化而來。
 * 但資料流只能讀取一次而已，若中途在Filter用掉，該特性將導致一些讀不到資料的情形。
 * 為了保留主體中的資料，可將請求與回應分別包裝成「ContentCachingRequestWrapper」與「ContentCachingResponseWrapper」，再如同往常傳入過濾鏈。
 * 
 * @author B04391
 *
 */

public class LogApiFilter extends OncePerRequestFilter {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
    
    //這兩個Wrapper的特色是會在內部另外備份一個「ByteArrayOutputStream」。我們只要呼叫Wrapper的「getContentAsByteArray」方法，就能不限次數地獲得主體內容。
    ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
    ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
    chain.doFilter(requestWrapper, responseWrapper);

    logAPI(request, response);
//    logBody(requestWrapper, responseWrapper);
    
    //最後呼叫ResponseWrapper的「copyBodyToResponse」方法，將上述備份的資料複製到Servlet的回應主體，如此API呼叫方才能收到預期的內容。
    responseWrapper.copyBodyToResponse();
  }

  //取出request response 列印
  protected void logAPI(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int httpStatus = response.getStatus();
    String httpMethod = request.getMethod();
    String uri = request.getRequestURI();
    String params = request.getQueryString();

    if (params != null) {
      uri += "?" + params;
    }

    logger.info(String.join(" ", String.valueOf(httpStatus), httpMethod, uri));
  }

  //使用Wrapper列印
  private void logBody(ContentCachingRequestWrapper request, ContentCachingResponseWrapper response) {
    String requestBody = getContent(request.getContentAsByteArray());
    System.out.println("Request: " + requestBody);

    String responseBody = getContent(response.getContentAsByteArray());
    System.out.println("Response: " + responseBody);
  }

  /**
   * 從Wrapper取得主體的「位元組陣列」後轉為字串，得到請求與回應的JSON資料。接著去除換行與定位符號後打印出來。
   * @param content
   * @return
   */
  private String getContent(byte[] content) {
    String body = new String(content);
    return body.replaceAll("[\n\t]", "");
  }

}