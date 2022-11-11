package com.danbplus.util.mybatis;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.danbplus.config.vo.COD_MGT;
import com.danbplus.config.vo.LOGIN_MGT;

@Mapper
@Repository
public interface MybatisRepository {
	List<COD_MGT> getCodeList(HashMap<String, Object> param);
	List<LOGIN_MGT> getLogin(HashMap<String, Object> param);
}
