package com.example.dynamicquery.mapper;


import com.example.dynamicquery.dao.entity.Product;
import com.example.dynamicquery.dto.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductDto productToProductDto(Product product);

}
