package org.smart4j.chapter3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter3.model.Customer;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.annotation.Transaction;
import org.smart4j.framework.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

@Service
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(org.smart4j.chapter3.model.Customer.class, sql);
    }

    public Customer getCustomer(int id) {
        String sql = "select * from customer where id=?";
        return DatabaseHelper.queryEntity(org.smart4j.chapter3.model.Customer.class, sql, id);
    }

    @Transaction
    public boolean createCustomer(Map<String, Object> filedMap) {
        return DatabaseHelper.insertEntity(org.smart4j.chapter3.model.Customer.class, filedMap);
    }

    @Transaction
    public boolean updateCustome(int id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(org.smart4j.chapter3.model.Customer.class, id, fieldMap);
    }

    @Transaction
    public boolean deleteCustomer(int id) {
        return DatabaseHelper.deleteEntity(org.smart4j.chapter3.model.Customer.class, id);
    }

}