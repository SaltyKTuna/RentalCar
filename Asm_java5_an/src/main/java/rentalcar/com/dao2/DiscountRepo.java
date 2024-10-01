package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Discount;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Integer> {
    // Tìm tất cả các giảm giá theo mã giảm giá
    @Query("SELECT d FROM Discounts d WHERE d.DiscountCode = :DiscountCode")
    List<Discount> findByDiscountCode(@Param("DiscountCode") String DiscountCode);

    // Tìm tất cả các giảm giá có giá trị lớn hơn một giá trị nhất định
    // @Query("SELECT d FROM Discounts d WHERE d.value > :value")
    // List<Discount> findByValueGreaterThan(@Param("value") Double value);

    @Query("SELECT d FROM Discounts")
	List<Discount> findAllDiscount();
}
