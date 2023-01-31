package com.shimadove.springsecurityseries.repo;

import com.shimadove.springsecurityseries.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<AdminUser, Long> {

    List<AdminUser> findByEmail(String email);
}
