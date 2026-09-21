package com.scaler.splitwise.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "groups_info")
public class Group extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "groups")
    private List<User> users;

    @OneToMany
    @JoinColumn(name = "group_id") // creates on many
    private List<Expense> expenses;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private User admin;
}
