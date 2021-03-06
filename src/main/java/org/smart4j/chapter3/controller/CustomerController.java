package org.smart4j.chapter3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter3.model.Customer;
import org.smart4j.chapter3.service.CustomerService;
import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.Param;
import org.smart4j.framework.bean.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Inject
    private CustomerService customerService;

    /**
     * 客户列表
     * @return
     */
    @Action("get:/customerList")
    public View customerList(Param param) {
        View view = null;
        String path = "customer/customer.jsp";
        Map<String, Object> model = new HashMap<String, Object>();
        try {
            List<Customer> customerList = customerService.getCustomerList();
            model.put("customerList", customerList);
            view = new View(model);
            view.setPath(path);
        } catch (Exception e) {
            LOGGER.error("加载客户列表失败", e);
            e.printStackTrace();
        }
        return view;
    }
}