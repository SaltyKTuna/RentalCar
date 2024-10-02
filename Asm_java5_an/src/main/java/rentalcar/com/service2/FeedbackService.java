package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Feedback;

public interface FeedbackService {

	Feedback getById(Integer id);

	void deleteById(Integer id);

	Optional<Feedback> findById(Integer id);

	List<Feedback> findAll();

	<S extends Feedback> S save(S entity);

	List<Feedback> findByCustomerID(Integer customerID);

}
