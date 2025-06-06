package com.arq.hexagonal.adapters.out.client.mapper;

import com.arq.hexagonal.adapters.out.client.response.AddressResponse;
import com.arq.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse response);
}
