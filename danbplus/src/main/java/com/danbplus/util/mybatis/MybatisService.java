package com.danbplus.util.mybatis;

import java.util.HashMap;
import java.util.List;

import com.danbplus.config.vo.COD_MGT;
import com.danbplus.config.vo.LOGIN_MGT;

public interface MybatisService {
	List<COD_MGT> getCodeList(HashMap<String, Object> param);
	List<LOGIN_MGT> getLogin(HashMap<String, Object> param);
}
