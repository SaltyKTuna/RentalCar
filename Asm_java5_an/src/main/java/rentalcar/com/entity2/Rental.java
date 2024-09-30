package rentalcar.com.entity2;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Rentals")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentalId;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Account account;

    @Column(nullable = false)
    private Date rentalDate;

    @Column(nullable = false)
    private Date returnDate;

    private Date actualReturnDate;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totalCost;

    @Column(nullable = false, length = 50)
    private String renStatus;

    @ManyToOne
    @JoinColumn(name = "discountId")
    private Discount discount;

    @Column(nullable = false)
    private Boolean haveDriver;

    // Getters and Setters
}

