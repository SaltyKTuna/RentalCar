package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.DrivingLicense;

@Repository
public interface DrivingLicensesRepo extends JpaRepository<DrivingLicense, Integer> {
    // Tìm tất cả các bằng lái theo ID 
    @Query("SELECT dl FROM DrivingLicenses dl WHERE dl.LicenseID = :LicenseID")
    List<DrivingLicense> findByLicenseID(@Param("LicenseID") Integer LicenseID);

    // Tìm tất cả các bằng lái theo loại bằng lái
    // @Query("SELECT dl FROM DrivingLicenses dl WHERE dl.licenseType = :licenseType")
    // List<DrivingLicense> findByLicenseType(@Param("licenseType") String licenseType);

    @Query("SELECT dl FROM DrivingLicenses")
	List<DrivingLicense> findAllDrivingLicense();
}
