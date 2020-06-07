package com.trucduong.product.repository.entity;

import com.trucduong.common.repository.entity.Auditable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_price_history")
public class ProductPriceHistory extends Auditable<String> {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "price", columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;
}
