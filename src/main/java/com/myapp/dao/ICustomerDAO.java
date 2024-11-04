package com.myapp.dao;

import com.myapp.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDAO  extends CrudRepository<Customer,Integer> {
}
