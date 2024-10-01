package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Damage;

@Repository
public interface DamageRepo extends JpaRepository<Damage, Integer> {
    // Tìm tất cả các thiệt hại theo ID xe
    @Query("SELECT d FROM Damages d WHERE d.vehicleID = :vehicleID")
    List<Damage> findByVehicleID(@Param("vehicleID") Integer vehicleID);

    // Tìm tất cả các thiệt hại theo mức độ thiệt hại
    // @Query("SELECT d FROM Damages d WHERE d.severity = :severity")
    // List<Damage> findBySeverity(@Param("severity") String severity);

    @Query("SELECT d FROM Damage d")
	List<Damage> findAllDamage();
}
