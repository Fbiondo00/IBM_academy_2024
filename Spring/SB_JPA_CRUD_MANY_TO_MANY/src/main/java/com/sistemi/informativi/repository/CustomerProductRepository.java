package com.sistemi.informativi.repository;

import java.util.List;

import com.sistemi.informativi.entity.Customer;
import com.sistemi.informativi.entity.Product;

public interface CustomerProductRepository {
	
	public void addCustomer(Customer customer);
	
	public void addProduct(Product product);
	
	public List<Customer> getCustomersByProduct(int productId);
	
	

}
