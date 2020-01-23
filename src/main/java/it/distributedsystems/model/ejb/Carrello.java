package it.distributedsystems.model.ejb;

import it.distributedsystems.model.dao.Customer;
import it.distributedsystems.model.dao.Product;
import it.distributedsystems.model.dao.Purchase;

import java.util.Set;

public interface Carrello{

	public Customer getCustomer();
	public void setCustomer(Customer customer);
	public Set<Product> getProducts();
	public void addProduct(Product product);
	public void deleteProduct(Product product);
	public String finalizePurchase();
	
}