package com.shimadove.springsecurityseries.repo;

import com.shimadove.springsecurityseries.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {
}
