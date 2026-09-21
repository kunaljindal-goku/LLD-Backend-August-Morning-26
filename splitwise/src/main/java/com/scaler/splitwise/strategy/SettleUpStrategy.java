package com.scaler.splitwise.strategy;

import com.scaler.splitwise.model.Expense;

import java.util.List;

public interface SettleUpStrategy {

    List<Expense> settleUp(List<Expense> expensesToSettleup);
}
