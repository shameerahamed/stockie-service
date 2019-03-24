package com.stockie.model;

import java.sql.Timestamp;

import javax.persistence.Column;

public class BaseModel {
	@Column(name="created_ts")
	private Timestamp createdTs;
	
	@Column(name="modified_ts")
	private Timestamp modifiedTs;
	
	public Timestamp getCreatedTs() {
		return createdTs;
	}
	public void setCreatedTs(Timestamp createdTs) {
		this.createdTs = createdTs;
	}
	public Timestamp getModifiedTs() {
		return modifiedTs;
	}
	public void setModifiedTs(Timestamp modifiedTs) {
		this.modifiedTs = modifiedTs;
	}
}
