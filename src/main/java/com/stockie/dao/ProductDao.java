package com.stockie.dao;

import java.util.List;

import com.stockie.model.Product;

/**
 * @author ShameerAhamed
 *
 */
public interface ProductDao {
	public void saveProduct(Product product);

	public List<Product> listProducts();
	
	public Product getProduct(int prodId);
	
	public void deleteProduct(int prodId);
}
