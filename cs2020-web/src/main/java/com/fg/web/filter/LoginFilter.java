package com.fg.web.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import com.fg.service.Enum.EnumRESCode;
import com.fg.service.login.LoginService;
import com.fg.service.vo.Result;
import com.fg.web.utils.CookiesUtil;

public class LoginFilter extends OncePerRequestFilter {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
//  private static final Set<String> PASS_PATHS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("/js/", "/css/", "/scss/", "/img/")));

  @Autowired
  LoginService loginServ;

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
    logger.info("login Filter start");
    ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
    ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
    String path = request.getRequestURI().substring(requestWrapper.getContextPath().length()).replaceAll("[/]+$", ""); // 現在請求的路徑
    logger.info("process Path : " + path);

    // 取得token
    Cookie ckLogInfo = CookiesUtil.getCookieByName(requestWrapper, "FGlogInfo");
    if (ckLogInfo == null) {
      // 沒token
      logger.info(">>> NO COOKIES");
      response.sendRedirect("/login");
    } else {
      // 檢核失效、帳密錯誤等等
      Result rs = loginServ.chkCookieLogin(ckLogInfo.getValue());
      if (rs.getResEnum().getCode() != EnumRESCode.SUCCESS.getCode()) {
        response.sendRedirect("/login");
      } else {
        chain.doFilter(request, response);
      }
    }

    logger.info("login Filter End");
  }

}