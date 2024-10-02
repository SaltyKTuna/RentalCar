package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.CarMaintenanceRepo;
import rentalcar.com.entity2.CarMaintenance;
import rentalcar.com.service2.CarMaintenanceService;

@Service
public class CarMaintenanceServiceImpl implements CarMaintenanceService{
	@Autowired CarMaintenanceRepo carmaintenanceRepo;

	@Override
	public List<CarMaintenance> findByCarID(Integer carID) {
		return carmaintenanceRepo.findByCarID(carID);
	}

	@Override
	public List<CarMaintenance> findAll() {
		return carmaintenanceRepo.findAll();
	}

	@Override
	public Optional<CarMaintenance> findById(Integer id) {
		return carmaintenanceRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		carmaintenanceRepo.deleteById(id);
	}

	@Override
	public CarMaintenance getById(Integer id) {
		return carmaintenanceRepo.getById(id);
	}

	@Override
	public <S extends CarMaintenance> S save(S entity) {
		return carmaintenanceRepo.save(entity);
	}
	
	
}
