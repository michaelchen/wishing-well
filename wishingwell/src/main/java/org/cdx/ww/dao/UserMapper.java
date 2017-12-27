package org.cdx.ww.dao;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	@Select("SELECT count(*) FROM users")
	int getUserCount();
}
