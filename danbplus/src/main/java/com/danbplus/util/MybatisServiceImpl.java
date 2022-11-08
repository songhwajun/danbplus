package com.danbplus.util;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danbplus.config.vo.COD_MGT;

@Service
public class MybatisServiceImpl implements MybatisService {
	@Autowired
	private MybatisRepository codeRepository;
	
	@Override
	public List<COD_MGT> getCodeList(HashMap<String, String> param) {
		System.out.println("==========================================="); 
		System.out.println("MybatisServiceImpl");
		System.out.println("==========================================="); 
		return codeRepository.getCodeList(param);
	}

}
