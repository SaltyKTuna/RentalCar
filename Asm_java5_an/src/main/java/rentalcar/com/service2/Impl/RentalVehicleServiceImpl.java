package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.RentalVehicleRepo;
import rentalcar.com.entity2.RentalVehicle;
import rentalcar.com.service2.RentalVehicleService;

@Service
public class RentalVehicleServiceImpl implements RentalVehicleService{
	@Autowired RentalVehicleRepo rentalVehicleRepo;

	@Override
	public List<RentalVehicle> findByRentalVehicleID(Integer RentalVehicleID) {
		return rentalVehicleRepo.findByRentalVehicleID(RentalVehicleID);
	}

	@Override
	public <S extends RentalVehicle> S save(S entity) {
		return rentalVehicleRepo.save(entity);
	}

	@Override
	public List<RentalVehicle> findAll() {
		return rentalVehicleRepo.findAll();
	}

	@Override
	public Optional<RentalVehicle> findById(Integer id) {
		return rentalVehicleRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		rentalVehicleRepo.deleteById(id);
	}

	@Override
	public RentalVehicle getById(Integer id) {
		return rentalVehicleRepo.getById(id);
	}
	
	
}
