package com.myapp.service;

import com.myapp.model.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> getCustomers();
    public void saveCustomer(Customer customer);
    public Customer getCustomer(Integer id);
    public void deleteCustomer(Integer customerId);


}
