package rentalcar.com.entity2;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "AdditionalFees")
public class AdditionalFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feeID;

    @ManyToOne
    @JoinColumn(name = "rentalVehicleID", nullable = false)
    private RentalVehicle rentalVehicle;

    @Column(nullable = false, length = 50)
    private String feeType;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(length = 255)
    private String description;

    // Getters and Setters
}

