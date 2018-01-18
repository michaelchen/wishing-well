package org.cdx.ww.dao;

import java.util.List;

import org.cdx.ww.entity.Wish;
import org.springframework.stereotype.Repository;

@Repository
public interface WishMapper {
	void addWish(Wish wish);

	List<Wish> getWishList(String account);

	List<Wish> getLatestWishList();

}
