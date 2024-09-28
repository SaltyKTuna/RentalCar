package rentalcar.com.service;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import rentalcar.com.entity.Order;
import rentalcar.com.report.ReportCategory;

public interface OrderService {

	Order create(JsonNode order);

	Order findById(Long id);

	List<Order> findByUsername(String username);

//	Double sumCostInMonth(Integer month);

	List<Order> findOrderInMonth(Integer month);

	Integer countOrderInMonth(Integer month);
	
}
