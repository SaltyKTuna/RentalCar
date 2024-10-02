package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.RentalVehicle;

public interface RentalVehicleService {

	RentalVehicle getById(Integer id);

	void deleteById(Integer id);

	Optional<RentalVehicle> findById(Integer id);

	List<RentalVehicle> findAll();

	<S extends RentalVehicle> S save(S entity);

	List<RentalVehicle> findByRentalVehicleID(Integer RentalVehicleID);

}
