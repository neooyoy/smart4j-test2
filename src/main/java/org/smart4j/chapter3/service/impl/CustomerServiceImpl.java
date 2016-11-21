package org.smart4j.chapter3.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter3.model.Customer;
import org.smart4j.chapter3.service.CustomerService;

import java.util.List;
import java.util.Map;

public class CustomerServiceImpl {

   /* private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return org.smart4j.chapter3.helper.DatabaseHelper.queryEntityList(org.smart4j.chapter3.model.Customer.class, sql);
    }

    public org.smart4j.chapter3.model.Customer getCustomer(int id) {
        String sql = "select * from customer where id=?";
        return org.smart4j.chapter3.helper.DatabaseHelper.queryEntity(org.smart4j.chapter3.model.Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> filedMap) {
        return org.smart4j.chapter3.helper.DatabaseHelper.insertEntity(org.smart4j.chapter3.model.Customer.class, filedMap);
    }

    public boolean updateCustome(int id, Map<String, Object> fieldMap) {
        return org.smart4j.chapter3.helper.DatabaseHelper.updateEntity(org.smart4j.chapter3.model.Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(int id) {
        return org.smart4j.chapter3.helper.DatabaseHelper.deleteEntity(org.smart4j.chapter3.model.Customer.class, id);
    }*/
}