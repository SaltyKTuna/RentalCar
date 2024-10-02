package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.CarRepo;
import rentalcar.com.entity2.Car;
import rentalcar.com.service2.CarService;

@Service
public class CarServiceImpl implements CarService{
	@Autowired CarRepo carRepo;

	@Override
	public <S extends Car> S save(S entity) {
		return carRepo.save(entity);
	}

	@Override
	public List<Car> findAll() {
		return carRepo.findAll();
	}

	@Override
	public Optional<Car> findById(Integer id) {
		return carRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		carRepo.deleteById(id);
	}
	
	
}
