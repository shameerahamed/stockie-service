package com.stockie.model;

// default package
// Generated Jun 25, 2017 1:53:14 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int userId;
	private String userName;
	private String password;
	private Integer enabled;
	private Date createdTs;
	private Date modifiedTs;
	private Set userRoles = new HashSet(0);

	public User() {
	}

	public User(int userId) {
		this.userId = userId;
	}

	public User(int userId, String userName, String password, Integer enabled, Date createdTs, Date modifiedTs,
			Set userRoles) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.createdTs = createdTs;
		this.modifiedTs = modifiedTs;
		this.userRoles = userRoles;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public Date getModifiedTs() {
		return this.modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public Set getUserRoleses() {
		return this.userRoles;
	}

	public void setUserRoleses(Set userRoles) {
		this.userRoles = userRoles;
	}

}
