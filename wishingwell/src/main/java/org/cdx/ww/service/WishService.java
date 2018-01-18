package org.cdx.ww.service;

import java.util.List;

import org.cdx.ww.entity.Wish;

public interface WishService {
	public void addWish(Wish wish);

	public List<Wish> getWishList(String account);

	public List<Wish> getLatestWishList();

}
