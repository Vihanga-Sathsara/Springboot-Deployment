package lk.ijse.springbootdeployment.Repository;

import lk.ijse.springbootdeployment.Entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepository extends JpaRepository<customer,Integer> {
}
