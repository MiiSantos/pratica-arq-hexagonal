package com.arq.hexagonal.application.ports.out;

import com.arq.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
