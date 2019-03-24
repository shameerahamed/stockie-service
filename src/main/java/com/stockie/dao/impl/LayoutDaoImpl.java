package com.stockie.dao.impl;

import org.springframework.stereotype.Repository;

import com.stockie.dao.LayoutDao;
import com.stockie.dao.StockieAbstractDao;
import com.stockie.model.Layout;

@Repository("layoutDao")
public class LayoutDaoImpl extends StockieAbstractDao implements LayoutDao {

	
	public Layout getLayout(int layoutId) {
		return (Layout) getSession().get(Layout.class, layoutId);
	}
	
}
