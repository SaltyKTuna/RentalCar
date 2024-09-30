package rentalcar.com.entity2;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ServicePricing")
public class ServicePricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer priceId;

    @Column(nullable = false, length = 50)
    private String vehicleType;

    @ManyToOne
    @JoinColumn(name = "carId")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "motorbikeId")
    private Motorbike motorbike;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal hourlyRate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal dailyRate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal longTermRate;

    @Column(precision = 5, scale = 2)
    private BigDecimal percentDiscount;

    @Column(length = 255)
    private String description;

    // Getters and Setters
}

