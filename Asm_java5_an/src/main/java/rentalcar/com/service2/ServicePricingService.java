package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.ServicePricing;

public interface ServicePricingService {

	ServicePricing getById(Integer id);

	void deleteById(Integer id);

	Optional<ServicePricing> findById(Integer id);

	List<ServicePricing> findAll();

	<S extends ServicePricing> S save(S entity);

}
