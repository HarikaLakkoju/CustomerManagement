package com.myapp.controller;


import com.myapp.model.Customer;
import com.myapp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/")
    public String showHomePage() {
        System.out.println("done");
        return "index"; // This resolves to /WEB-INF/views/index.jsp
    }

    @GetMapping("/list")
    public String listCustomers(Map<String, Object> model) {
        System.out.println("Implementation class is :: " + service.getClass().getName());
        List<Customer> customers = service.getCustomers();
        customers.forEach(System.out::println);
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getFirstName().compareTo(c2.getFirstName());
            }
        });
        customers.forEach(System.out::println);
        model.put("customers", customers);
        return "list-customers";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Map<String, Object> model) {
        Customer customer = new Customer();
        model.put("customer", customer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer);
        service.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam Integer customerId, Map<String, Object> model) {
        Customer customer = service.getCustomer(customerId);
        System.out.println(customer);

        model.put("customer", customer);
        return "customer-form";
    }

    @GetMapping("/showFormForDelete")
    public String showFormForDelete(@RequestParam Integer customerId) {
        service.deleteCustomer(customerId);
        return "redirect:/customer/list";
    }



}
