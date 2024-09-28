package rentalcar.com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import rentalcar.com.entity.Brand;

public interface BrandService {

	List<Brand> findAll();

	Brand findById(String id);

	boolean existsById(String id);

	Brand save(Brand brand);

	void deleteById(String id);

	List<Brand> findByName(String kw);
	
}
