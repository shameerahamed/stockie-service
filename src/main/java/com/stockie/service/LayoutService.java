package com.stockie.service;

import java.util.List;

import com.stockie.model.Layout;

/**
 * @author ShameerA
 *
 */
public interface LayoutService {
	/**
	 * @param id
	 * @return
	 */
	public Layout getLayout(int id);
	
	public List<Layout> listLayouts();
}
