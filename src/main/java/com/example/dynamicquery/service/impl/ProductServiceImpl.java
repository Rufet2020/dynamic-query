package com.example.dynamicquery.service.impl;

import com.example.dynamicquery.dao.entity.DynamicQuery;
import com.example.dynamicquery.dto.model.ProductDto;
import com.example.dynamicquery.mapper.ProductMapper;
import com.example.dynamicquery.repository.ProductRepository;
import com.example.dynamicquery.service.DynamicQueryService;
import com.example.dynamicquery.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper mapper;
    private final DynamicQueryService queryService;
    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts(String queryName, String version) {
        DynamicQuery dynamicQuery = queryService.getQuery(queryName, version);
        return productRepository.findProductsByDynamicQuery(dynamicQuery.getQuery()).stream()
                .map(mapper::productToProductDto).toList();
    }
}
