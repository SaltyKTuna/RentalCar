package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Damage;

public interface DamageService {

	Damage getById(Integer id);

	void deleteById(Integer id);

	Optional<Damage> findById(Integer id);

	List<Damage> findAll();

	<S extends Damage> S save(S entity);

	List<Damage> findByVehicleID(Integer vehicleID);

}
