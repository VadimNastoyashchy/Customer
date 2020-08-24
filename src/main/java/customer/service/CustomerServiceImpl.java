package customer.service;

import customer.model.Customer;
import customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
