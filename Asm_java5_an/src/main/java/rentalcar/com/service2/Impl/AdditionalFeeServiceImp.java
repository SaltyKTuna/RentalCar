package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.AdditionalFeeRepo;
import rentalcar.com.entity2.AdditionalFee;
import rentalcar.com.service2.AdditionalFeeService;

@Service
public class AdditionalFeeServiceImp implements AdditionalFeeService{
	@Autowired AdditionalFeeRepo additionalfeeRepo;

	@Override
	public List<AdditionalFee> findByRentalVehicleID(Integer rentalVehicleID) {
		return additionalfeeRepo.findByRentalVehicleID(rentalVehicleID);
	}

	@Override
	public List<AdditionalFee> findAll() {
		return additionalfeeRepo.findAll();
	}

	@Override
	public Optional<AdditionalFee> findById(Integer id) {
		return additionalfeeRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		additionalfeeRepo.deleteById(id);
	}

	@Override
	public AdditionalFee getById(Integer id) {
		return additionalfeeRepo.getById(id);
	}

	@Override
	public <S extends AdditionalFee> S save(S entity) {
		return additionalfeeRepo.save(entity);
	}
	
	
}
