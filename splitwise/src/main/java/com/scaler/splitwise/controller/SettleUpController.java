package com.scaler.splitwise.controller;

import com.scaler.splitwise.dto.request.SettleUpGroupRequest;
import com.scaler.splitwise.dto.request.SettleUpUserRequest;
import com.scaler.splitwise.dto.response.SettleUpResponse;
import com.scaler.splitwise.model.Expense;
import com.scaler.splitwise.model.enums.ExpenseType;
import com.scaler.splitwise.service.SettleUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    @Autowired
    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpResponse settleUpGroup(SettleUpGroupRequest request) {
        List<Expense> expenses = settleUpService.settleUpGroup(request.getGroupId());
        SettleUpResponse settleUpResponse = new SettleUpResponse();
        settleUpResponse.setExpenses(expenses);
        return settleUpResponse;
    }

    public SettleUpResponse settleUpUser(SettleUpUserRequest request) {
        return null;
    }
}
