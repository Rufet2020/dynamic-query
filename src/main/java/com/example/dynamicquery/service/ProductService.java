package com.example.dynamicquery.service;

import com.example.dynamicquery.dto.model.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts(String queryName, String version);

}
