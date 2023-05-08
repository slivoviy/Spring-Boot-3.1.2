package com.sl17.springboot312.dao;



import com.sl17.springboot312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
