package com.scaler.splitwise.dto.response;

import com.scaler.splitwise.model.Expense;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleUpResponse {

    private List<Expense> expenses;
}
