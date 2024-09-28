package rentalcar.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity.RoleDetail;


@Repository
public interface RoleDetailRepo extends JpaRepository<RoleDetail, Long>{

}
