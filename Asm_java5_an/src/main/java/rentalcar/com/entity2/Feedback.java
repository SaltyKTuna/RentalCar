package rentalcar.com.entity2;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackID;

    @ManyToOne
    @JoinColumn(name = "rentalID", nullable = false)
    private Rental rental;

    @Column(nullable = false)
    private Integer rating;

    @Column(length = 255)
    private String comment;

    @Column(nullable = false)
    private LocalDate feedbackDate;

    // Getters and Setters
}
