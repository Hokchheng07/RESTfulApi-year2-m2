package comspring.restfulapim2.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(
            nullable = false,
            length = 50
    )
    private String name;

    @Column(
            nullable = false,
            unique = true
    )

    private String username;

    @Column(
            nullable = false,
            unique = true,
            length = 100
    )
    private String email;

    @Column(
        nullable = false,
        length = 50
    )
    private String password;

    @Column(
            nullable = false
    )
    private Boolean isActive;

    @OneToOne
    private Customer customer;

}
