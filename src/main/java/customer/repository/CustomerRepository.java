package customer.repository;

import customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vadym Nastoiashchyi
 */


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
