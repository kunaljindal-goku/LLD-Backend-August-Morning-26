package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "users")
@Getter
@Setter
public class User extends BaseEntity{

    private String name;

    private String phoneNumber;

    private String email;

    @ManyToMany
    @JoinTable(name = "user_group")
    private List<Group> groups;
}
