package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.DiscountRepo;
import rentalcar.com.entity2.Discount;
import rentalcar.com.service2.DiscountService;

@Service
public class DiscountServiceImpl implements DiscountService{
	@Autowired DiscountRepo discountRepo;

	@Override
	public List<Discount> findByDiscountCode(String DiscountCode) {
		return discountRepo.findByDiscountCode(DiscountCode);
	}

	@Override
	public <S extends Discount> S save(S entity) {
		return discountRepo.save(entity);
	}

	@Override
	public List<Discount> findAll() {
		return discountRepo.findAll();
	}

	@Override
	public Optional<Discount> findById(Integer id) {
		return discountRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		discountRepo.deleteById(id);
	}

	@Override
	public Discount getById(Integer id) {
		return discountRepo.getById(id);
	}
	
	
}
