package com.spring.mvc.crudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.crudapp.model.Product;

@Component
public class ProductDao 
{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create or save product into table
	@Transactional
	public void createProduct(Product product)
	{
		//when we perform update operation for handal request we pass /handal-product so in that createProduct()
		//method is of productDao.for adding or updating product we use below method
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	// get all product
	public List<Product> getAllProduct()
	{ 
		List<Product> products =this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete single product
	@Transactional
	public void deleteProduct(int pId)
	{
		Product product = this.hibernateTemplate.load(Product.class,pId);
		this.hibernateTemplate.delete(product);
	}
	
	//get single product
		@Transactional
		public Product getProduct(int pId)
		{
			return this.hibernateTemplate.get(Product.class, pId);
		}
	
	
}
