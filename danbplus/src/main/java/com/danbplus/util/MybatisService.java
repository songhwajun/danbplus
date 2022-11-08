package com.danbplus.util;

import java.util.HashMap;
import java.util.List;

import com.danbplus.config.vo.COD_MGT;

public interface MybatisService {
	List<COD_MGT> getCodeList(HashMap<String, String> param);
}
