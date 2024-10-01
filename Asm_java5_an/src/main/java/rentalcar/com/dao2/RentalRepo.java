package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Rental;

@Repository
public interface RentalRepo extends JpaRepository<Rental, Integer> {
    // Tìm tất cả các thuê xe theo ID Account
    @Query("SELECT r FROM Rentals r WHERE r.AccountID = :AccountID")
    List<Rental> findByAccountID(@Param("AccountID") Integer AccountID);

    // Tìm tất cả các thuê xe theo ngày thuê
    @Query("SELECT r FROM Rentals r WHERE r.rentalDate = :rentalDate")
    List<Rental> findByRentalDate(@Param("rentalDate") String rentalDate);

    @Query("SELECT p FROM Rentals")
	List<Rental> findAllPayment();
}
