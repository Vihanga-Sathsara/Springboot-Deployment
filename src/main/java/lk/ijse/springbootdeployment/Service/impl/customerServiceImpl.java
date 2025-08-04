package lk.ijse.springbootdeployment.Service.impl;

import lk.ijse.springbootdeployment.Entity.customer;
import lk.ijse.springbootdeployment.Repository.customerRepository;
import lk.ijse.springbootdeployment.Service.customerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class customerServiceImpl implements customerService {
    private final customerRepository repository;

    @Override
    public customer saveCustomer(customer Customer) {
        return repository.save(Customer);
    }
}
