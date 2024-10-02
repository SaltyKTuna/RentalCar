package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.CarMaintenance;

public interface CarMaintenanceService {

	<S extends CarMaintenance> S save(S entity);

	CarMaintenance getById(Integer id);

	void deleteById(Integer id);

	Optional<CarMaintenance> findById(Integer id);

	List<CarMaintenance> findAll();

	List<CarMaintenance> findByCarID(Integer carID);

}
