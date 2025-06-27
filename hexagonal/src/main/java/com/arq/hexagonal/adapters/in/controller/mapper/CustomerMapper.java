package com.arq.hexagonal.adapters.in.controller.mapper;

import com.arq.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.arq.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.arq.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "valid", ignore = true)
    @Mapping(source = "name", target = "name")
    @Mapping(source = "cpf", target = "cpf")
    Customer toCustomer(CustomerRequest customerRequest);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "valid", target = "isValid")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "cpf", target = "cpf")
    CustomerResponse toCustomerResponse(Customer customer);
}
