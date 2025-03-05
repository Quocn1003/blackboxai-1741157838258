package com.abc.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    @NotNull(message = "Price is required")
    @Column(nullable = false)
    private Double price;

    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
