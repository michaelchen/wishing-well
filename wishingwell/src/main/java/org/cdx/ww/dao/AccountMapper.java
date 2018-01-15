package org.cdx.ww.dao;

import org.apache.ibatis.annotations.Select;
import org.cdx.ww.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
	//@Select("select * from account where id = 1")
	Account getAccount(int id);
	Account findAccount(Account account);
}
