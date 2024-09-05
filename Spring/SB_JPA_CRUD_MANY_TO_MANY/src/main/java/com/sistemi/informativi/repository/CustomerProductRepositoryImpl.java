package com.sistemi.informativi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sistemi.informativi.entity.Customer;
import com.sistemi.informativi.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class CustomerProductRepositoryImpl implements CustomerProductRepository{

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addCustomer(Customer customer) {

		em.persist(customer);

	}

	@Override
	public void addProduct(Product product) {

		em.persist(product);

	}

	@Override
	public List<Customer> getCustomersByProduct(int productId) {

		return em.find(Product.class, productId).getCustomers();
	}

}
