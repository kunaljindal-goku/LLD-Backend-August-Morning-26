package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.Feature;
import com.scaler.BookMyShow.models.enums.ScreenStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseEntity{

    private String name;

    @ManyToMany
    private List<Seat> seats;

    @ElementCollection
    private List<Feature> features;

    private ScreenStatus status;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;
}
