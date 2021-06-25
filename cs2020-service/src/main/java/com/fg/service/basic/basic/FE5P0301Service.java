package com.fg.service.basic.basic;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.fg.dao.entity.fe5d.FE5D03Entity;
import com.fg.dao.repository.fe5d.FE5D03Repo;
import com.fg.service.BaseService;
import com.fg.service.Enum.EnumRESCode;
import com.fg.service.vo.Result;
import com.fg.service.vo.basic.basic.ProjectCodeVo;

@Service
public class FE5P0301Service extends BaseService {

	@Autowired
	private FE5D03Repo fe5d03Reps;

	public Result insert(ProjectCodeVo projectCodeVo) {
		Result rs = new Result();
//		EnumRESCode valid = null;

		FE5D03Entity entity = new FE5D03Entity();
//		FE5D03Entity entity_1 = new FE5D03Entity();

		try {
			BeanUtils.copyProperties(projectCodeVo, entity);
			logger.debug("=^o^= projectCodeVo="+projectCodeVo.toString());
			logger.debug("=^o^= entity="+entity.toString());
			entity = fe5d03Reps.save(entity);
			logger.info("test");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 解密token
//		String[] dyToken = AES.AESDncode(RULEKEY, strCookies).split("&&");
//		String time = dyToken[0];
//		String useracc = dyToken[1];
//		String userpwd = dyToken[2];

		rs.setResEnum(EnumRESCode.SUCCESS);
		return rs;
	}

	public EnumRESCode validUser(String useracc, String userpsw) {
		// 輸入空白
		if (StringUtils.pathEquals(useracc, "") || StringUtils.pathEquals(userpsw, "")) {
			return EnumRESCode.LOGINFAIL;
		}

		// 資料庫檢核
		Result userRs = new Result();
		return userRs.getResEnum();
	}

}