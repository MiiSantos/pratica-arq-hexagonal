package com.arq.hexagonal.config;

import com.arq.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arq.hexagonal.adapters.out.InsertCustomerAdapter;
import com.arq.hexagonal.adapters.out.SendCpfValidationAdpater;
import com.arq.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdpater sendCpfValidationAdpater
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdpater);
    }
}
