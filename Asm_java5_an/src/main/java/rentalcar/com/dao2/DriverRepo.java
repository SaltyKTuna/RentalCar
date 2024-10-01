package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer> {
    // Tìm tất cả các tài xế theo tên
    @Query("SELECT d FROM Drivers d WHERE d.FullName LIKE :FullName")
    List<Driver> findByFullName(@Param("FullName") String FullName);

    // Tìm tất cả các tài xế theo số điện thoại
    @Query("SELECT d FROM Drivers d WHERE d.phoneNumber = :phoneNumber")
    List<Driver> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);

    @Query("SELECT d FROM Drivers")
	List<Driver> findAllDriver();
}
