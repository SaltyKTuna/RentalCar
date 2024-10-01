package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer>{

    // Tìm tất cả các xe theo loại xe
    @Query("SELECT c FROM Cars c WHERE c.Model = :Model")
    List<Car> findByType(@Param("Model") String Model);

    // Tìm tất cả các xe theo hãng xe
    @Query("SELECT c FROM Cars c WHERE c.Make = :Make")
    List<Car> findByBrand(@Param("Make") String Make);

    @Query("SELECT c FROM Cars")
	List<Car> findAllCar();
}
