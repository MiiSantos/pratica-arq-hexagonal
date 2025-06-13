package com.arq.hexagonal.adapters.out;

import com.arq.hexagonal.adapters.out.repository.CustomerRepository;
import com.arq.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.arq.hexagonal.application.core.domain.Customer;
import com.arq.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerEntityMapper mapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = mapper.toCustomerEntity(customer);
        repository.save(customerEntity);
    }
}
