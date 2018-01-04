package org.cdx.ww.service.impl;

import org.cdx.ww.dao.AccountMapper;
import org.cdx.ww.dao.UserMapper;
import org.cdx.ww.datasource.DataSource;
import org.cdx.ww.entity.Account;
import org.cdx.ww.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AccountMapper accountMapper;

	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Transactional
	@DataSource("MASTER")
	public int getUserCount() {
		return userMapper.getUserCount(1);
	}
	
	public Account getAccount(int id) {
		return accountMapper.getAccount(id);
	}

}
