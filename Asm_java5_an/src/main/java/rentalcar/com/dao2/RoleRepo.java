package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import rentalcar.com.entity2.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    // Tìm tất cả các vai trò theo tên vai trò
    @Query("SELECT r FROM Roles r WHERE r.roleName = :roleName")
    List<Role> findByRoleName(@Param("roleName") String roleName);

    @Query("SELECT r FROM Roles")
	List<Role> findAllRole();
}
