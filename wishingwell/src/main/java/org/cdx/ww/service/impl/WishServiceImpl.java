package org.cdx.ww.service.impl;

import java.util.List;

import org.cdx.ww.dao.WishMapper;
import org.cdx.ww.datasource.DataSource;
import org.cdx.ww.entity.Wish;
import org.cdx.ww.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WishServiceImpl implements WishService {

	@Autowired
	private WishMapper wishMapper;

	@Transactional
	@DataSource("MASTER")
	public void addWish(Wish wish) {
		wishMapper.addWish(wish);
	}

	@Transactional
	@DataSource("MASTER")
	public List<Wish> getWishList(String account) {
		return wishMapper.getWishList(account);
	}

	@Transactional
	@DataSource("MASTER")
	public List<Wish> getLatestWishList() {
		return wishMapper.getLatestWishList();
	}

}
