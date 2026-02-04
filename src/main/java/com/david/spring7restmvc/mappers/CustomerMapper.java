package com.david.spring7restmvc.mappers;

import com.david.spring7restmvc.entities.Customer;
import com.david.spring7restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);
}
