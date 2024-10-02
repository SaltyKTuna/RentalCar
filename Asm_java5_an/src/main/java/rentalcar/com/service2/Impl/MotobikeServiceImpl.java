package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.MotobikeRepo;
import rentalcar.com.entity2.Motorbike;
import rentalcar.com.service2.MotobikeService;

@Service
public class MotobikeServiceImpl implements MotobikeService{
	@Autowired MotobikeRepo motobikeRepo;

	@Override
	public List<Motorbike> findByType(String Model) {
		return motobikeRepo.findByType(Model);
	}

	@Override
	public List<Motorbike> findByBrand(String brand) {
		return motobikeRepo.findByBrand(brand);
	}

	@Override
	public <S extends Motorbike> S save(S entity) {
		return motobikeRepo.save(entity);
	}

	@Override
	public List<Motorbike> findAll() {
		return motobikeRepo.findAll();
	}

	@Override
	public Optional<Motorbike> findById(Integer id) {
		return motobikeRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		motobikeRepo.deleteById(id);
	}

	@Override
	public Motorbike getById(Integer id) {
		return motobikeRepo.getById(id);
	}
	
	
}
