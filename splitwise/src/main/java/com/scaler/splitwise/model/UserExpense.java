package com.scaler.splitwise.model;

import com.scaler.splitwise.model.enums.UserExpenseType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "user_expenses")
public class UserExpense extends BaseEntity{

    private double amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;

    @Enumerated(value = EnumType.STRING)
    private UserExpenseType userExpenseType;
}
