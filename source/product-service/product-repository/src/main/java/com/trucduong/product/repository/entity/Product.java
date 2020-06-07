package com.trucduong.product.repository.entity;

import com.trucduong.common.repository.entity.Auditable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends Auditable<String> {
    @Id
    private long id;

    @Column(name = "p_name", columnDefinition = "NVARCHAR(500)")
    private String name;

    @Column(name = "price", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;

    @Column(name = "brand", columnDefinition = "NVARCHAR(1000)")
    private String brand;

    @Column(name = "colour", columnDefinition = "NVARCHAR(255)")
    private String colour;


}
