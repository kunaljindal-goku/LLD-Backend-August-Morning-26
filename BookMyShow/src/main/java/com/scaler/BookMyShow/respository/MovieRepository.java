package com.scaler.BookMyShow.respository;

import com.scaler.BookMyShow.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
