package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Motorbike;

@Repository
public interface MotobikeRepo extends JpaRepository<Motorbike, Integer> {
    // Tìm tất cả các xe máy theo loại xe
    @Query("SELECT m FROM Motorbikes m WHERE m.Model = :Model")
    List<Motorbike> findByType(@Param("Model") String Model);

    // Tìm tất cả các xe máy theo hãng xe
    @Query("SELECT m FROM Motorbikes m WHERE m.brand = :brand")
    List<Motorbike> findByBrand(@Param("brand") String brand);

    @Query("SELECT m FROM Motorbikes")
	List<Motorbike> findAllMotorbike();
}
