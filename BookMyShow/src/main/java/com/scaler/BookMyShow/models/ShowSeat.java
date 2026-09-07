package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.SeatStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseEntity{

    private Show show;
    private Seat seat;
    private SeatStatus status;
}
