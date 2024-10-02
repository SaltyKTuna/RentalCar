package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.DrivingLicense;

public interface DrivingLicenseService {

	DrivingLicense getById(Integer id);

	void deleteById(Integer id);

	Optional<DrivingLicense> findById(Integer id);

	List<DrivingLicense> findAll();

	<S extends DrivingLicense> S save(S entity);

}
