package rentalcar.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity.OrderDetail;


@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, Long>{

}
