package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import rentalcar.com.entity2.ServicePricing;

@Repository
public interface ServicePricingRepo extends JpaRepository<ServicePricing, Integer> {
    // Tìm tất cả các giá dịch vụ theo ID
    @Query("SELECT sp FROM ServicePricings sp WHERE sp.PriceID = :PriceID")
    List<ServicePricing> findByPriceID(@Param("PriceID") Integer PriceID);

    @Query("SELECT sp FROM ServicePricings")
	List<ServicePricing> findAllServicePricing();
}
    