package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.ServicePricingRepo;
import rentalcar.com.entity2.ServicePricing;
import rentalcar.com.service2.ServicePricingService;

@Service
public class ServicePricingServiceImpl implements ServicePricingService{
	@Autowired ServicePricingRepo servicepricingRepo;

	@Override
	public <S extends ServicePricing> S save(S entity) {
		return servicepricingRepo.save(entity);
	}

	@Override
	public List<ServicePricing> findAll() {
		return servicepricingRepo.findAll();
	}

	@Override
	public Optional<ServicePricing> findById(Integer id) {
		return servicepricingRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		servicepricingRepo.deleteById(id);
	}

	@Override
	public ServicePricing getById(Integer id) {
		return servicepricingRepo.getById(id);
	}
	
	
}
