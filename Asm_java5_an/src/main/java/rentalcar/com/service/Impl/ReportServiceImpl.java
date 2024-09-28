package rentalcar.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao.ReportCostRepo;
import rentalcar.com.dao.ReportProductRepo;
import rentalcar.com.report.ReportCost;
import rentalcar.com.report.ReportProduct;
import rentalcar.com.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	@Autowired ReportCostRepo rpcRepo;
	@Autowired ReportProductRepo rprRepo;
	@Override
	public List<ReportCost> reportCostInMonth(Integer month) {
		List<ReportCost> lst = rpcRepo.reportCost(month);
		return lst;
	}
	@Override
	public List<ReportProduct> reportProductInMonth(Integer month) {
		List<ReportProduct> lst = rprRepo.reportProduct(month);
		return lst;
	}

}
