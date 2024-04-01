package com.example.dynamicquery.service.impl;

import com.example.dynamicquery.dao.entity.DynamicQuery;
import com.example.dynamicquery.exception.QueryNotFoundException;
import com.example.dynamicquery.repository.DynamicQueryRepository;
import com.example.dynamicquery.service.DynamicQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DynamicQueryServiceImpl implements DynamicQueryService {

    private final DynamicQueryRepository queryRepository;

    @Override
    public DynamicQuery getQuery(String queryName, String version) {
        return queryRepository.findDynamicQueryByQueryNameAndVersion(queryName, version)
                .orElseThrow(QueryNotFoundException::new);
    }

}
