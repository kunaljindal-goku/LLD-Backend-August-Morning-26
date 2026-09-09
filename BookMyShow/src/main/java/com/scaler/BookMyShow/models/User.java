package com.scaler.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseEntity{

    private String email;
    private String name;
    private String mobileNo;

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

}
