package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoryDTO {

    private Long categoryId;
    @NotEmpty(message = "Category name cannot be empty")
    private String categoryName;
}
