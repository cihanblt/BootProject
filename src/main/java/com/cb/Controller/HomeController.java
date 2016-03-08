package com.cb.Controller;

import com.cb.Models.Customer;
import com.cb.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by cihan on 1.03.2016.
 */
@RestController
public class HomeController {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/deneme.php")
    public ModelAndView deneme(){
        ModelAndView modelAndView = new ModelAndView("deneme");
        modelAndView.addObject("test","bu bir testtttt mesjdır....");
        return modelAndView;
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        System.out.println("test");
        return "test";
    }

    @RequestMapping(value = "add_customer")
    public String addCustomer(){
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("chn","blt"));
        list.add(new Customer("aaa","bbb"));
        list.add(new Customer("ttt","yyyy"));
        repository.save(list);
        return "ok";
    }
    @RequestMapping("/customers")
    public @ResponseBody
    Collection<Customer> getCustomers(){
        System.out.println("dene");
        return this.repository.findAll();
    }
}
