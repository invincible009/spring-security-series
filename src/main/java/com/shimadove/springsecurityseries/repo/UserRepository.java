package com.shimadove.springsecurityseries.repo;

import com.shimadove.springsecurityseries.entity.UserPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserPojo,Long> {

    UserPojo findByEmail(String mail);
}
