package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.DriverRepo;
import rentalcar.com.entity2.Driver;
import rentalcar.com.service2.DriverService;

@Service
public class DriverServiceImpl implements DriverService{
	@Autowired DriverRepo driverRepo;

	@Override
	public List<Driver> findByFullName(String FullName) {
		return driverRepo.findByFullName(FullName);
	}

	@Override
	public <S extends Driver> S save(S entity) {
		return driverRepo.save(entity);
	}

	@Override
	public List<Driver> findAll() {
		return driverRepo.findAll();
	}

	@Override
	public Optional<Driver> findById(Integer id) {
		return driverRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		driverRepo.deleteById(id);
	}

	@Override
	public Driver getById(Integer id) {
		return driverRepo.getById(id);
	}
	
	
}
