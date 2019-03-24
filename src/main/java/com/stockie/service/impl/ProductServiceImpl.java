package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.ProductDao;
import com.stockie.model.Product;
import com.stockie.service.ProductService;
import com.stockie.service.StockieAbstractService;

@Service ("productService")
public class ProductServiceImpl extends StockieAbstractService implements ProductService {
	
	@Autowired
	ProductDao productDao;

	public void saveProduct(Product product) {
		productDao.saveProduct(product);
	}

	public List<Product> listProducts() {
		return productDao.listProducts();
	}

	public Product getProduct(int prodId) {
		return productDao.getProduct(prodId);
	}

	public void deleteProduct(int prodId) {
		productDao.deleteProduct(prodId);
	}

}
