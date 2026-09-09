package com.scaler.BookMyShow.respository;

import com.scaler.BookMyShow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface ShowRepository extends JpaRepository<Show,Integer> {
}
