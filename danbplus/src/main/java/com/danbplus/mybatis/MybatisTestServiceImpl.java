package com.danbplus.mybatis;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danbplus.vo.common.COD_MGT;

@Service
public class MybatisTestServiceImpl implements MybatisTestService {
	@Autowired
	private MybatisTestRepository codeRepository;
	
	@Override
	public List<COD_MGT> getCodeList(HashMap<String, String> param) {
		System.out.println("==========================================="); 
		System.out.println("CodeRepository");
		System.out.println("==========================================="); 
		return codeRepository.getCodeList(param);
	}

}
