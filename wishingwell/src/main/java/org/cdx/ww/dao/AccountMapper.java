package org.cdx.ww.dao;

import org.cdx.ww.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
	Account getAccount(int id);
}
