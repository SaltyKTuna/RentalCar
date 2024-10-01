package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Feedback;

@Repository
public interface FeedBackRepo extends JpaRepository<Feedback, Integer> {
    // Tìm tất cả các phản hồi theo ID khách hàng
    @Query("SELECT f FROM Feedbacks f WHERE f.customerID = :customerID")
    List<Feedback> findByCustomerID(@Param("customerID") Integer customerID);

    // Tìm tất cả các phản hồi theo mức độ hài lòng
    @Query("SELECT f FROM Feedbacks f WHERE f.rating = :rating")
    List<Feedback> findByRating(@Param("rating") Integer rating);

    @Query("SELECT dl FROM Feedbacks")
	List<Feedback> findAllFeedback();
}
