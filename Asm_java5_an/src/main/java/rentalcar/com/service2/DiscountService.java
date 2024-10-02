package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Discount;

public interface DiscountService {

	Discount getById(Integer id);

	void deleteById(Integer id);

	Optional<Discount> findById(Integer id);

	List<Discount> findAll();

	<S extends Discount> S save(S entity);

	List<Discount> findByDiscountCode(String DiscountCode);

}
