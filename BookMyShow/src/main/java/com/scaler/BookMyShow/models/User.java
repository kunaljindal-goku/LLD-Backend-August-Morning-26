package com.scaler.BookMyShow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends BaseEntity{

    private String email;
    private String name;
    private String mobileNo;
    private List<Ticket> tickets;

}
