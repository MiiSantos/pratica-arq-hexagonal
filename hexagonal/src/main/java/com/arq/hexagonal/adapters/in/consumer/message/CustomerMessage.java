package com.arq.hexagonal.adapters.in.consumer.message;

import com.arq.hexagonal.application.core.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private String zipCode;
    private Boolean isValid;
}
