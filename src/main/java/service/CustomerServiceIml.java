package service;

import lombok.extern.slf4j.Slf4j;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import repository.ReadFileCust;

import java.util.HashMap;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceIml implements CustomerService{

    @Autowired
    CustomerRepository repository;

    @Override
    public Customer getById(UUID id) {
        log.info("IN CustomerServiceIml getById {}", id);
        Customer customer = ReadFileCust.rFileCust(id,
                "C:\\Users\\Владимир\\Desktop\\NamesForBankAccounts\\1.txt");
        return customer;
    }

    /*@Override
    public List<Customer> getAll() {
        return repository.findAll();*/
    }
