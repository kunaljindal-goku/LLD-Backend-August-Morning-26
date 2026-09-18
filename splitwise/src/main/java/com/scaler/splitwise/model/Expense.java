package com.scaler.splitwise.model;

import com.scaler.splitwise.model.enums.ExpenseType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "expenses")
public class Expense extends BaseEntity{

    private String description;

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenses;

    @Enumerated(value = EnumType.STRING)
    private ExpenseType expenseType;

}
