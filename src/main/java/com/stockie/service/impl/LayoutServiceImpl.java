package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.LayoutDao;
import com.stockie.model.Layout;
import com.stockie.service.LayoutService;
import com.stockie.service.ProductService;
import com.stockie.service.StockieAbstractService;

@Service("layoutService")
public class LayoutServiceImpl extends StockieAbstractService implements LayoutService {

	@Autowired
	LayoutDao layoutDao;
	
	@Autowired
	ProductService productService;
	
	public Layout getLayout(int layoutId) {
		return layoutDao.getLayout(layoutId);
	}
	
	

	public List<Layout> listLayouts() {
		// TODO add feature later
		return null;
	} 
	
}
