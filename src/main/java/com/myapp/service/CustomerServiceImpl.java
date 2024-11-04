package com.myapp.service;

import com.myapp.dao.ICustomerDAO;
import com.myapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerDAO dao;

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) dao.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("CustomerServiceImpl.saveCustomer");
       dao.save(customer);
        System.out.println("saveddd"
        );
    }

    @Override
    public Customer getCustomer(Integer id) {
        Optional<Customer> byId = dao.findById(id);
        return byId.get();

    }

    @Override
    public void deleteCustomer(Integer customerId) {
dao.deleteById(customerId);
    }
}
