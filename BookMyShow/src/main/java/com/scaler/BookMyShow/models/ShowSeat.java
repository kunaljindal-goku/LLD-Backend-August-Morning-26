package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.SeatStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends BaseEntity{

    private Show show;
    private Seat seat;

    @Enumerated(value = EnumType.STRING) // stores enums as string, default- ordinal
    private SeatStatus status;
}
