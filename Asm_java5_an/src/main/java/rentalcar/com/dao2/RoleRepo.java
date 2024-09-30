package rentalcar.com.dao2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Role;


@Repository
public interface RoleRepo extends JpaRepository<Role, Integer>{

}
