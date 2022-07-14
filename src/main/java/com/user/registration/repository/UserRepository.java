package com.user.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.registration.entity.UserData;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long>{

}
