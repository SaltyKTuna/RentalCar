package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.RentalVehicle;

@Repository
public interface RentalVehicleRepo extends JpaRepository<RentalVehicle, Integer> {
    // Tìm tất cả các xe thuê theo ID thuê xe
    @Query("SELECT rv FROM RentalVehicles rv WHERE rv.RentalVehicleID = :RentalVehicleID")
    List<RentalVehicle> findByRentalVehicleID(@Param("RentalVehicleID") Integer RentalVehicleID);

    // Tìm tất cả các xe thuê theo ID xe
    // @Query("SELECT rv FROM RentalVehicles rv WHERE rv.vehicleID = :vehicleID")
    // List<RentalVehicle> findByVehicleID(@Param("vehicleID") Integer vehicleID);

    @Query("SELECT rv FROM RentalVehicles")
	List<RentalVehicle> findAllRentalVehicle();
}
