package com.stockie.service;

import java.util.List;

import com.stockie.model.Product;

/**
 * @author ShameerAhamed
 *
 */
public interface ProductService {
	public void saveProduct(Product productBean);

	public List<Product> listProducts();
	
	public Product getProduct(int id);
	
	public void deleteProduct(int id);
}
