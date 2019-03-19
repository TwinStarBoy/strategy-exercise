package com.org.strategyExercise.repaymentStrategy;

public class CCBRepaymentChannel implements RepaymentChannel {
    public void printChannel() {
        System.out.println("建设银行卡,使用建设银行还款渠道.");
    }
}
