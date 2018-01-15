package org.cdx.ww.service.impl;

import org.cdx.ww.dao.AccountMapper;
import org.cdx.ww.datasource.DataSource;
import org.cdx.ww.entity.Account;
import org.cdx.ww.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Transactional
	@DataSource("MASTER")
	public boolean auth(Account account) {
		Account result = accountMapper.findAccount(account);
		if (result == null) {
			return false;
		}
		return true;
	}

}
