package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.DrivingLicensesRepo;
import rentalcar.com.entity2.DrivingLicense;
import rentalcar.com.service2.DrivingLicenseService;

@Service
public class DrivingLicenseServiceImpl implements DrivingLicenseService{
	@Autowired DrivingLicensesRepo drivinglicenseRepo;

	@Override
	public <S extends DrivingLicense> S save(S entity) {
		return drivinglicenseRepo.save(entity);
	}

	@Override
	public List<DrivingLicense> findAll() {
		return drivinglicenseRepo.findAll();
	}

	@Override
	public Optional<DrivingLicense> findById(Integer id) {
		return drivinglicenseRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		drivinglicenseRepo.deleteById(id);
	}

	@Override
	public DrivingLicense getById(Integer id) {
		return drivinglicenseRepo.getById(id);
	}
	
	
}
