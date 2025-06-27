package com.arq.hexagonal.adapters.out.repository.mapper;

import com.arq.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.arq.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "valid", target = "isValid")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "cpf", target = "cpf")
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
