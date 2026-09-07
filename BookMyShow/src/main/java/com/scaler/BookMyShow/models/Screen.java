package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.Feature;
import com.scaler.BookMyShow.models.enums.ScreenStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseEntity{

    private String name;
    private List<Seat> seats;
    private List<Feature> features;
    private ScreenStatus status;
}
