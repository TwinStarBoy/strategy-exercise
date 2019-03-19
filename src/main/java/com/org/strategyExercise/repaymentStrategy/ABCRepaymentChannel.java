package com.org.strategyExercise.repaymentStrategy;

public class ABCRepaymentChannel implements RepaymentChannel {
    public void printChannel() {
        System.out.println("农业银行卡,使用农业银行还款渠道.");
    }
}
