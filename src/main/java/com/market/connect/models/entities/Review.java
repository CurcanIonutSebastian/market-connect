package com.market.connect.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
    @Min(0)
    @Max(5)
    @Column(name = "rating")
    private short rating;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;
}