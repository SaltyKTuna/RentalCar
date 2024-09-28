package rentalcar.com.service;

import java.util.List;

import rentalcar.com.report.ReportCost;
import rentalcar.com.report.ReportProduct;

public interface ReportService {
	List<ReportCost> reportCostInMonth(Integer month);
	List<ReportProduct> reportProductInMonth(Integer month);
}
