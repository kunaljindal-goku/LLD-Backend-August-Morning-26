package com.scaler.BookMyShow.service;

import com.scaler.BookMyShow.models.Show;
import com.scaler.BookMyShow.models.ShowSeat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculator {

    public double calculatePrice(Show show, List<ShowSeat> showSeats) {
        return 100.0;
    }
}
