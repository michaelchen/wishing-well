package org.cdx.ww.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.cdx.ww.entity.Account;
import org.cdx.ww.entity.Wish;
import org.cdx.ww.service.AccountService;
import org.cdx.ww.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WishController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private WishService wishService;
	
	@RequestMapping("/addWish")
	public ModelAndView addWish(HttpSession session, @RequestParam("content") String content) {
		String account = (String)session.getAttribute("username");
		Account acc = accountService.getAccount(account);
		if (!StringUtils.isEmpty(content)) {
			Wish wish = new Wish();
			wish.setContent(content);
			wish.setAccountId(acc.getId());
			wish.setAccount(acc.getAccount());
			wishService.addWish(wish);
		}
		List<Wish> wishList = wishService.getWishList(account);
		return new ModelAndView("wish_list", "wishList", wishList);
	}

	@RequestMapping("/wishList")
	public ModelAndView wishList(HttpSession session) {
		String account = (String)session.getAttribute("username");
		List<Wish> wishList = wishService.getWishList(account);
		return new ModelAndView("wish_list", "wishList", wishList);
	}
	
	@RequestMapping("/latestWishList")
	public ModelAndView latestWishList() {
		List<Wish> wishList = wishService.getLatestWishList();
		return new ModelAndView("latest_wish_list", "wishList", wishList);
	}

}
