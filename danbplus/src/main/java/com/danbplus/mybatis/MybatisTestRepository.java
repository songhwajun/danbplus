package com.danbplus.mybatis;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.danbplus.vo.common.COD_MGT;

@Mapper
@Repository
public interface MybatisTestRepository {
	List<COD_MGT> getCodeList(HashMap<String, String> param);
}
