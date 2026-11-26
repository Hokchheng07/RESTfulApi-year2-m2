package comspring.restfulapim2.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(
            nullable = false,
            length = 50
    )

    private String name;

    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String description;

    @Column(
            nullable = false
    )
    @Positive

    private BigDecimal price;

    @Column(
            nullable = false
    )

    private Integer quantity;

    @Column(
            nullable = false
    )
    private Boolean isAvailable;

    @ManyToOne
    private Category category;


}
