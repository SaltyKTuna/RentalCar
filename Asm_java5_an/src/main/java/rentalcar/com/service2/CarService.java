package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Car;

public interface CarService {

	void deleteById(Integer id);

	Optional<Car> findById(Integer id);

	List<Car> findAll();

	<S extends Car> S save(S entity);

}
