package com.aurionpro.test;
import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.*;
public class RepositoryTest {

	public static void main(String[] args) {
		IRepository customer=new CustomerRepository();
		repositoryCrud(customer);
		IRepository product=new ProductRepository();
		repositoryCrud(product);
		IRepository order=new OrderRepository();
		repositoryCrud(order);
	}

	private static void repositoryCrud(IRepository repository) {
		repository.create();
		repository.update();
		repository.update();
		repository.delete();
		System.out.println("----------------");
		
	}

	

}
