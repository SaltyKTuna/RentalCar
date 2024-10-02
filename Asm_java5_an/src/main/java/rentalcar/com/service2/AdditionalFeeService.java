package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.AdditionalFee;

public interface AdditionalFeeService {

	AdditionalFee getById(Integer id);

	void deleteById(Integer id);

	Optional<AdditionalFee> findById(Integer id);

	List<AdditionalFee> findAll();

	List<AdditionalFee> findByRentalVehicleID(Integer rentalVehicleID);

	<S extends AdditionalFee> S save(S entity);

}
