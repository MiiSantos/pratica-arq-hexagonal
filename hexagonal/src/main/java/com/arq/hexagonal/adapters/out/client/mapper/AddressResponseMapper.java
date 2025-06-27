package com.arq.hexagonal.adapters.out.client.mapper;

import com.arq.hexagonal.adapters.out.client.response.AddressResponse;
import com.arq.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    @Mapping(source = "street", target = "street")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "state", target = "state")
    Address toAddress(AddressResponse response);
}
