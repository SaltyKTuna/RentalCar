package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.FeedBackRepo;
import rentalcar.com.entity2.Feedback;
import rentalcar.com.service2.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	@Autowired FeedBackRepo feedbackRepo;

	@Override
	public List<Feedback> findByCustomerID(Integer customerID) {
		return feedbackRepo.findByCustomerID(customerID);
	}

	@Override
	public <S extends Feedback> S save(S entity) {
		return feedbackRepo.save(entity);
	}

	@Override
	public List<Feedback> findAll() {
		return feedbackRepo.findAll();
	}

	@Override
	public Optional<Feedback> findById(Integer id) {
		return feedbackRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		feedbackRepo.deleteById(id);
	}

	@Override
	public Feedback getById(Integer id) {
		return feedbackRepo.getById(id);
	}
	
	
}
