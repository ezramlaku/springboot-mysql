package com.thinkconstructive.rest_demo.repository;

import com.thinkconstructive.rest_demo.model.ArifUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArifUserRepository extends JpaRepository<ArifUser,Long> {
    ArifUser findByUserId(Long userId);

}
