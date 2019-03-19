package com.org.strategyExercise.repaymentStrategy;

public class ICBCRepaymentChannel implements RepaymentChannel {
    public void printChannel() {
        System.out.println("工商银行卡,使用工商银行还款渠道.");
    }
}
