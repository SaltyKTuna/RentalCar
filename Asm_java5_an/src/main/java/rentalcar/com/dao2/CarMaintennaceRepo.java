package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import rentalcar.com.entity2.CarMaintenance;

@Repository
public interface CarMaintennaceRepo extends JpaRepository<CarMaintenance, Integer> {
    // Tìm tất cả các bảo dưỡng xe theo ID xe
    @Query("SELECT cm FROM CarMaintenances cm WHERE cm.carID = :carID")
    List<CarMaintenance> findByCarID(@Param("carID") Integer carID);

    // Tìm tất cả các bảo dưỡng xe theo ngày bảo dưỡng
    @Query("SELECT cm FROM CarMaintenances cm WHERE cm.maintenanceDate = :maintenanceDate")
    List<CarMaintenance> findByMaintenanceDate(@Param("maintenanceDate") String maintenanceDate);

    @Query("SELECT cm FROM CarMaintenances")
	List<CarMaintenance> findAllCarMaintenance();
}
