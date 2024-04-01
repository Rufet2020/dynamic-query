package com.example.dynamicquery.repository;

import com.example.dynamicquery.dao.entity.Product;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final EntityManager entityManager;

    public List<Product> findProductsByDynamicQuery(String query) {
        return entityManager.createQuery(query, Product.class).getResultList();
    }

}
