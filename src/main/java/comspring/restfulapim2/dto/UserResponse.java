package comspring.restfulapim2.dto;

import java.util.UUID;

public record UserResponse(

        UUID id,

        String name,

        String username,

        Boolean isActive

) {
}
