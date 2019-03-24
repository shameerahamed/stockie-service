package com.stockie.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stockie.dao.ProductDao;
import com.stockie.dao.StockieAbstractDao;
import com.stockie.model.Product;

/**
 * @author ShameerAhamed
 *
 */
@Repository ("productDao")
public class ProductDaoImpl extends StockieAbstractDao implements ProductDao {
	
	public void saveProduct(Product product) {
		getSession().saveOrUpdate(product);
	}

	public List<Product> listProducts() {
		return (List<Product>) getSession().createCriteria(Product.class).list();
	}

	public Product getProduct(int prodId) {
		return (Product) getSession().get(Product.class, prodId);
	}

	public void deleteProduct(int prodId) {
		getSession().createQuery("DELETE FROM Product WHERE prodId = "+prodId).executeUpdate();
	}

}
