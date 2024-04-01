package com.example.dynamicquery.repository;

import com.example.dynamicquery.dao.entity.DynamicQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DynamicQueryRepository extends JpaRepository<DynamicQuery, Long> {

    Optional<DynamicQuery> findDynamicQueryByQueryNameAndVersion(String queryName, String version);

}
