package com.scaler.BookMyShow.models;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Region extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "region")
    private List<Theatre> theatres;
}
