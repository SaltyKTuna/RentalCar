package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.AdditionalFee;

@Repository
public interface AdditionalFeeRepo extends JpaRepository<AdditionalFee, Integer> {

    // Tìm tất cả các phí bổ sung theo RentalVehicleID
    @Query("SELECT af FROM AdditionalFees af WHERE af.rentalVehicleID = :rentalVehicleID")
    List<AdditionalFee> findByRentalVehicleID(@Param("rentalVehicleID") Integer rentalVehicleID);

    // Tìm tất cả các phí bổ sung theo loại phí
    @Query("SELECT af FROM AdditionalFees af WHERE af.feeType = :feeType")
    List<AdditionalFee> findByFeeType(@Param("feeType") String feeType);

    // Tìm tất cả các phí bổ sung có số tiền lớn hơn một giá trị nhất định
    @Query("SELECT af FROM AdditionalFees af WHERE af.amount > :amount")
    List<AdditionalFee> findByAmountGreaterThan(@Param("amount") Double amount);

    @Query("SELECT af FROM AdditionalFees")
	List<AdditionalFee> findAllAdditionalFee();
}
