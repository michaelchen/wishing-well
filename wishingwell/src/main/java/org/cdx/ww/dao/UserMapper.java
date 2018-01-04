package org.cdx.ww.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	@Select("SELECT count(*) FROM users where id = #{id}")
	int getUserCount(int id);
}