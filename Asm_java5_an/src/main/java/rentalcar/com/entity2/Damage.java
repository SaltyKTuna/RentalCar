package rentalcar.com.entity2;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Damages")
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer damageID;

    @ManyToOne
    @JoinColumn(name = "rentalVehicleID", nullable = false)
    private RentalVehicle rentalVehicle;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal repairCost;

    @Column(nullable = false)
    private LocalDate damageDate;

    // Getters and Setters
}

