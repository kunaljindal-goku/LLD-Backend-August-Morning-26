package com.scaler.splitwise.factory;

import com.scaler.splitwise.strategy.ChainSettleUpStrategy;
import com.scaler.splitwise.strategy.HeapSettleUpStrategy;
import com.scaler.splitwise.strategy.SettleUpStrategy;

public class SettleUpStrategyFactory {

    public static SettleUpStrategy getSettleUpStrategy(String strategy) {
        if(strategy.equals("heap")) {
            return new HeapSettleUpStrategy();
        }
        else if(strategy.equals("normal")) {
            return new ChainSettleUpStrategy();
        }

        throw new RuntimeException();
    }
}
