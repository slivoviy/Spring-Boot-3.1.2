package com.sl17.springboot312.repository;



import com.sl17.springboot312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
