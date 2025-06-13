package com.arq.hexagonal.application.core.usecase;

import com.arq.hexagonal.application.core.domain.Customer;
import com.arq.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.arq.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.arq.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertUserUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertUserUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = this.findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);

        this.insertCustomerOutputPort.insert(customer);
    }
}
