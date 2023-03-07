package com.example.ShoppingMall.Services;

import com.example.ShoppingMall.Modules.CustomerDT;
import com.example.ShoppingMall.Repository.CustomerDTRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDTServicesImpl implements CustomerDTServices{

    @Autowired
    CustomerDTRepo customerDTRepo;

    @Override
    public CustomerDT registrationCustomer(CustomerDT customerDT) {
        return customerDTRepo.save(customerDT);
    }


    @Override
    public List<CustomerDT> getAllRegistration() {
        return customerDTRepo.findAll();
    }

    @Override
    public CustomerDT customerAuthentication(CustomerDT customerDT, Integer id) {
        return null;
    }

    @Override
    public CustomerDT EditProfile(CustomerDT customerDT, Integer id) {
        CustomerDT V1=customerDTRepo.findById(id).orElseThrow(
                ()->new RuntimeException("Please Enter All your Details Correctly")
        );
        V1.setName(customerDT.getName());
        V1.setEmail(customerDT.getEmail());
        V1.setPassword(customerDT.getPassword());
        V1.setAddress(customerDT.getAddress());
        V1.setPhoneNo(customerDT.getPhoneNo());
        V1.setDateOfBirth(customerDT.getDateOfBirth());
        V1.setGender(customerDT.getGender());
        V1.setAccountStatus(customerDT.getAccountStatus());
        V1.setAccountCreationDate(customerDT.getAccountCreationDate());
        V1.setLastLoginDate(customerDT.getLastLoginDate());
        V1.setRoles(customerDT.getRoles());
        return customerDTRepo.save(V1);
    }

    @Override
    public CustomerDT UserProfileManagement(CustomerDT customerDT, Integer id) {
        return null;
    }

    @Override
    public CustomerDT Password_Reset(CustomerDT customerDT, Integer id) {
        return null;
    }

    @Override
    public CustomerDT userRoles(CustomerDT customerDT, Integer id) {
        return null;
    }

    @Override
    public void DeactivateCustomer(Integer id) {

    }
}
