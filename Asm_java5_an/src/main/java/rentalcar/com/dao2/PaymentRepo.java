package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    // Tìm tất cả các thanh toán theo ID đơn hàng
    @Query("SELECT p FROM Payments p WHERE p.PaymentID = :PaymentID")
    List<Payment> findByPaymentID(@Param("PaymentID") Integer PaymentID);

    // Tìm tất cả các thanh toán theo phương thức thanh toán
    @Query("SELECT p FROM Payments p WHERE p.PaymentMethod = :PaymentMethod")
    List<Payment> findByMethod(@Param("PaymentMethod") String PaymentMethod);

    @Query("SELECT p FROM Payments")
	List<Payment> findAllPayment();
}
