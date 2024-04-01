package com.example.dynamicquery.service;

import com.example.dynamicquery.dao.entity.DynamicQuery;

public interface DynamicQueryService {

    DynamicQuery getQuery(String queryName, String version);

}
