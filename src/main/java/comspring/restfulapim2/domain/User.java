package comspring.restfulapim2.domain;


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

public class User {

    private UUID id;

    private String name;

    private String username;

    private String password;

    private Boolean isActive;


}
