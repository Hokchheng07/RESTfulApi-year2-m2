package comspring.restfulapim2.dto;

import comspring.restfulapim2.domain.Category;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductResponse(

        UUID id,

        String name,

        String description,

        BigDecimal price,

        Integer qty,

        Category category


) {
}
