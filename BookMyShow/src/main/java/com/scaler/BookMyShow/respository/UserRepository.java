package com.scaler.BookMyShow.respository;

import com.scaler.BookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // gender and age > input age
    Optional<User> findByEmail(String email);
}
