package com.danbplus.util.mybatis;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danbplus.config.vo.COD_MGT;
import com.danbplus.config.vo.LOGIN_MGT;
import com.danbplus.config.vo.USER_INFO;

@Service
public class MybatisServiceImpl implements MybatisService {
	@Autowired
	private MybatisRepository codeRepository;
	
	@Override
	public List<COD_MGT> getCodeList(HashMap<String, Object> param) {
		return codeRepository.getCodeList(param);
	}

	@Override
	public List<LOGIN_MGT> getLogin(HashMap<String, Object> param) {
		return codeRepository.getLogin(param);
	}
}
