package com.scaler.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDto {

    private int userId;
    private int showId;
    private List<Integer> seatIds;
}
