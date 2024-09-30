package rentalcar.com.entity2;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Motorbikes")
public class Motorbike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer motorbikeId;

    @Column(nullable = false, length = 100)
    private String make;

    @Column(nullable = false, length = 100)
    private String model;

    @Column(nullable = false, length = 100)
    private String condition;

    @Column(nullable = false, length = 255)
    private String vehicleLocation;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false, length = 20)
    private String licensePlate;

    @Column(length = 50)
    private String color;

    @Column(nullable = false)
    private Integer mileage;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal dailyRate;

    @Column(nullable = false)
    private Integer engineCapacity;

    @Column(nullable = false, length = 50)
    private String fuelType;

    @Column(nullable = false, precision = 4, scale = 1)
    private BigDecimal fuelConsumption;

    @Column(length = 255)
    private String imageUrl;

    @Column(nullable = false, length = 255)
    private String detailBike;

    @Column(nullable = false, length = 255)
    private String facilities;

    @OneToMany(mappedBy = "motorbike", cascade = CascadeType.ALL)
    private List<ServicePricing> servicePricingList;
    // Getters and Setters
}
