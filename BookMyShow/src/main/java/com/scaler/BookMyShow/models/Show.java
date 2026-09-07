package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.Feature;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Show extends BaseEntity{

    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Screen screen;
    private List<Feature> features;
}
