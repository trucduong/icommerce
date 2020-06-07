package com.trucduong.product.repository;

import com.trucduong.product.repository.entity.ProductPriceHistory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceHistoryRepository extends CrudRepository<ProductPriceHistory, Long> {
}
