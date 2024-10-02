package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.RentalRepo;
import rentalcar.com.entity2.Rental;
import rentalcar.com.service2.RentalService;

@Service
public class RentalServiceImpl implements RentalService{
	@Autowired RentalRepo rentalRepo;

	@Override
	public List<Rental> findByAccountID(Integer AccountID) {
		return rentalRepo.findByAccountID(AccountID);
	}

	@Override
	public <S extends Rental> S save(S entity) {
		return rentalRepo.save(entity);
	}

	@Override
	public List<Rental> findAll() {
		return rentalRepo.findAll();
	}

	@Override
	public Optional<Rental> findById(Integer id) {
		return rentalRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		rentalRepo.deleteById(id);
	}

	@Override
	public Rental getById(Integer id) {
		return rentalRepo.getById(id);
	}
	
	
}
