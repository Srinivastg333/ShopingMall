package com.example.ShoppingMall.Services;

import com.example.ShoppingMall.Modules.CustomerDT;

import java.util.List;

public interface CustomerDTServices {

    CustomerDT registrationCustomer(CustomerDT customerDT);

    List<CustomerDT> getAllRegistration();
    CustomerDT customerAuthentication(CustomerDT customerDT,Integer id);
    CustomerDT EditProfile(CustomerDT customerDT,Integer id);
    CustomerDT UserProfileManagement(CustomerDT customerDT,Integer id);
    CustomerDT Password_Reset(CustomerDT customerDT,Integer id);
    CustomerDT userRoles(CustomerDT customerDT,Integer id);
    void DeactivateCustomer(Integer id);
}
