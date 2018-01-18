package org.cdx.ww.entity;

import java.util.Date;

public class Wish {

	private int id;

	private String content;

	private int isFulfilled;

	private int accountId;

	private String account;

	private Date createTime;

	private Date updateTime;

	private Date fulfilledTime;
	
	private int fulfilledAccountId;

	private String fulfilledAccount;

	private int deleteFlg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public int getIsFulfilled() {
		return isFulfilled;
	}

	public void setIsFulfilled(int isFulfilled) {
		this.isFulfilled = isFulfilled;
	}

	public Date getFulfilledTime() {
		return fulfilledTime;
	}

	public void setFulfilledTime(Date fulfilledTime) {
		this.fulfilledTime = fulfilledTime;
	}

	public int getFulfilledAccountId() {
		return fulfilledAccountId;
	}

	public void setFulfilledAccountId(int fulfilledAccountId) {
		this.fulfilledAccountId = fulfilledAccountId;
	}

	public String getFulfilledAccount() {
		return fulfilledAccount;
	}

	public void setFulfilledAccount(String fulfilledAccount) {
		this.fulfilledAccount = fulfilledAccount;
	}

	@Override
	public String toString() {
		return "Wish [id=" + id +
				",content=" + content + 
				",isFulfilled=" + isFulfilled + 
				",accountId=" + accountId +
				",account=" + account + 
				",updateTime=" + updateTime +
				",createTime=" + createTime +
				",updateTime=" + updateTime +
				",fulfilledTime=" + fulfilledTime +
				",fulfilledAccountId=" + fulfilledAccountId +
				",fulfilledAccount=" + fulfilledAccount +
				",deleteFlg=" + deleteFlg + "]";
	}

}
