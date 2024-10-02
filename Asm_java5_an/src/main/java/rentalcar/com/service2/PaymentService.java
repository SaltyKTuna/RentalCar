package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import rentalcar.com.entity2.Payment;

public interface PaymentService {

	Payment getById(Integer id);

	void deleteById(Integer id);

	Optional<Payment> findById(Integer id);

	Page<Payment> findAll(Pageable pageable);

	List<Payment> findAll();

	<S extends Payment> S save(S entity);

	List<Payment> findByPaymentID(Integer PaymentID);

}
