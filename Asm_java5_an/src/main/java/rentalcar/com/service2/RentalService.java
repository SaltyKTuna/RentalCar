package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Rental;

public interface RentalService {

	Rental getById(Integer id);

	void deleteById(Integer id);

	Optional<Rental> findById(Integer id);

	List<Rental> findAll();

	<S extends Rental> S save(S entity);

	List<Rental> findByAccountID(Integer AccountID);

}
