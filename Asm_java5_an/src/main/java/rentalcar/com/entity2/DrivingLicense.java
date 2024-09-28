package rentalcar.com.entity2;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "DrivingLicenses")
public class DrivingLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer licenseId;

    @ManyToOne
    @JoinColumn(name = "AccountID", nullable = false)
    private Account account;

    @Column(nullable = false, length = 50)
    private String licenseNumber;

    private Date dateOfBirth;

    @Column(length = 255)
    private String imageUrl;

    @Column(nullable = false, length = 50)
    private String licenseStatus;

    // Getters and Setters
}

