package com.scaler.BookMyShow.models;

import com.scaler.BookMyShow.models.enums.Feature;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie extends BaseEntity{

    private String title;
    private List<String> cast;
    private String genre;
    private List<String> languages;
    private List<Feature> features;
    private String description;
}
