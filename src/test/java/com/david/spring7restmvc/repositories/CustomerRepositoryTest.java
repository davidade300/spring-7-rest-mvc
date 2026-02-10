package com.david.spring7restmvc.repositories;

import com.david.spring7restmvc.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void testSaveCustomer() {
        Customer savedCustomer = customerRepository.save(Customer
                .builder()
                .name("My customer")
                .build());

        assertThat(savedCustomer).isNotNull();
        assertThat(savedCustomer.getId()).isNotNull();
    }


}