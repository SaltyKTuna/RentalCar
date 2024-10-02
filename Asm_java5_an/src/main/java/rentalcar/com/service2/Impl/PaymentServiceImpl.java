package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.PaymentRepo;
import rentalcar.com.entity2.Payment;
import rentalcar.com.service2.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired PaymentRepo paymentRepo;

	@Override
	public List<Payment> findByPaymentID(Integer PaymentID) {
		return paymentRepo.findByPaymentID(PaymentID);
	}

	@Override
	public <S extends Payment> S save(S entity) {
		return paymentRepo.save(entity);
	}

	@Override
	public List<Payment> findAll() {
		return paymentRepo.findAll();
	}

	@Override
	public Page<Payment> findAll(Pageable pageable) {
		return paymentRepo.findAll(pageable);
	}

	@Override
	public Optional<Payment> findById(Integer id) {
		return paymentRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		paymentRepo.deleteById(id);
	}

	@Override
	public Payment getById(Integer id) {
		return paymentRepo.getById(id);
	}
	
	
}
