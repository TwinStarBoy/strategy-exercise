package com.org.strategyExercise.repaymentStrategy;

public class WalletRepaymentChannel implements RepaymentChannel {
    public void printChannel() {
        System.out.println("没有使用银行卡还款,使用零钱包还款.");
    }
}
