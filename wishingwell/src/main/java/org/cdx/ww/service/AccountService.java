package org.cdx.ww.service;

import org.cdx.ww.entity.Account;

public interface AccountService {

	public boolean auth(Account account);

	public Account getAccount(String account);

	public void addAccount(Account acc);

}
