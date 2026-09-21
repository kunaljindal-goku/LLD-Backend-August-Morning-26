package com.scaler.splitwise.service;

import com.scaler.splitwise.exceptions.GroupNotFoundException;
import com.scaler.splitwise.factory.SettleUpStrategyFactory;
import com.scaler.splitwise.model.Expense;
import com.scaler.splitwise.model.Group;
import com.scaler.splitwise.repository.GroupRepository;
import com.scaler.splitwise.strategy.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettleUpService {

    private GroupRepository groupRepository;
    private SettleUpStrategy strategy;

    public SettleUpService(GroupRepository groupRepository,
                           String strategy) {
        this.groupRepository = groupRepository;
        this.strategy = SettleUpStrategyFactory.getSettleUpStrategy(strategy);
    }

    public List<Expense> settleUpGroup(int groupId) {
        Group group = groupRepository.findById(groupId)
                .orElseThrow(() -> new GroupNotFoundException("Invalid group id: "+groupId));

        List<Expense> expenseToSettleUp = group.getExpenses();
        return strategy.settleUp(expenseToSettleUp);
    }
}
