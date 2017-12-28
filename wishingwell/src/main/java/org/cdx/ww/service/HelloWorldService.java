package org.cdx.ww.service;

import org.cdx.ww.dao.UserMapper;
import org.cdx.ww.datasource.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloWorldService {
	
	@Autowired
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Transactional
	@DataSource("MASTER")
	public int getUserCount() {
		return userMapper.getUserCount();
	}
	
}
