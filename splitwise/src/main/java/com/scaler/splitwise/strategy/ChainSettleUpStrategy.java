package com.scaler.splitwise.strategy;

import com.scaler.splitwise.model.Expense;

import java.util.List;

public class ChainSettleUpStrategy implements SettleUpStrategy{
    @Override
    public List<Expense> settleUp(List<Expense> expensesToSettleup) {
        return List.of();
    }
}
