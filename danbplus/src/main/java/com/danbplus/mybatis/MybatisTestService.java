package com.danbplus.mybatis;

import java.util.HashMap;
import java.util.List;

import com.danbplus.vo.common.COD_MGT;

public interface MybatisTestService {
	List<COD_MGT> getCodeList(HashMap<String, String> param);
}
