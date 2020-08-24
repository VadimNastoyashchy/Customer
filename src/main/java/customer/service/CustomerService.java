package customer.service;

import customer.model.Customer;

import java.util.List;

/**
 * @author Vadym Nastoiashchyi
 */
public interface CustomerService {
    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();

}
