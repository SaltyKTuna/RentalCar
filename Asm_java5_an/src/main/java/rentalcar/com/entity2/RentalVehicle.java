package rentalcar.com.entity2;

import javax.persistence.*;

@Entity
@Table(name = "RentalVehicles")
public class RentalVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentalVehicleId;

    @ManyToOne
    @JoinColumn(name = "rentalId", nullable = false)
    private Rental rental;

    @ManyToOne
    @JoinColumn(name = "carId")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "motorbikeId")
    private Motorbike motorbike;

    @Column(nullable = false, length = 50)
    private String vehicleType;

    @ManyToOne
    @JoinColumn(name = "driverId")
    private Driver driver;

    // Getters and Setters
}
