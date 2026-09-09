package com.scaler.BookMyShow.dto;

import com.scaler.BookMyShow.models.enums.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDto {

    private String bookingId;
    private double amount;
    private ResponseStatus status;
}
