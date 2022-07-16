package com.shimadove.springsecurityseries.repo;

import com.shimadove.springsecurityseries.entity.UserPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserRepository extends JpaRepository<UserPojo,Long > {
    Optional<UserPojo> findByEmail(String email);
}
