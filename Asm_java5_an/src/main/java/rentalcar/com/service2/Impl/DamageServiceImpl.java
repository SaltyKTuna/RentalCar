package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.DamageRepo;
import rentalcar.com.entity2.Damage;
import rentalcar.com.service2.DamageService;

@Service
public class DamageServiceImpl implements DamageService{
	@Autowired DamageRepo damageRepo;

	@Override
	public List<Damage> findByVehicleID(Integer vehicleID) {
		return damageRepo.findByVehicleID(vehicleID);
	}

	@Override
	public <S extends Damage> S save(S entity) {
		return damageRepo.save(entity);
	}

	@Override
	public List<Damage> findAll() {
		return damageRepo.findAll();
	}

	@Override
	public Optional<Damage> findById(Integer id) {
		return damageRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		damageRepo.deleteById(id);
	}

	@Override
	public Damage getById(Integer id) {
		return damageRepo.getById(id);
	}
	
	
}
