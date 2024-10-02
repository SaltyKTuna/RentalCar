package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Driver;

public interface DriverService {

	Driver getById(Integer id);

	void deleteById(Integer id);

	Optional<Driver> findById(Integer id);

	List<Driver> findAll();

	<S extends Driver> S save(S entity);

	List<Driver> findByFullName(String FullName);

}
