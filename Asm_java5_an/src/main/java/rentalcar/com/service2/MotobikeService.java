package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Motorbike;

public interface MotobikeService {

	Motorbike getById(Integer id);

	void deleteById(Integer id);

	Optional<Motorbike> findById(Integer id);

	List<Motorbike> findAll();

	<S extends Motorbike> S save(S entity);

	List<Motorbike> findByBrand(String brand);

	List<Motorbike> findByType(String Model);

}
