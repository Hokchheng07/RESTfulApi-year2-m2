package comspring.restfulapim2.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="customers")
public class Customer {

    @Id
    private UUID id;

    @Column(
            nullable = false,
            unique = true,
            length = 60
    )
    private String email;
    @Column(
            nullable = false
    )
    private String address;
    @Column(
            nullable = false,
            unique = true,
            length = 60
    )
    private String phoneNumber;
    @Column(
            nullable = false
    )
    private Boolean isDeleted;

    @OneToOne(mappedBy = "customer")
    private User user;


}
