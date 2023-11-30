package com.market.connect.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "description")
    private String description;
    @Min(0)
    @Max(5)
    @NotBlank
    @Column(name = "rating")
    private short rating;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;
}