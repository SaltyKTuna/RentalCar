package rentalcar.com.entity2;

public class Account {

}

import javax.persistence.*;

@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(nullable = false, length = 255)
    private String fullName;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(length = 20)
    private String phoneNumber;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @Column(nullable = false, length = 255)
    private String passwordHash;

    @ManyToOne
    @JoinColumn(name = "RoleID", nullable = false)
    private Role role;

    @Column(length = 255)
    private String address;

    private Date dateOfBirth;

    // Getters and Setters
}
