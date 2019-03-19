package com.org.strategyExercise.repaymentStrategy;

public class BOCRepaymentChannel implements RepaymentChannel {
    public void printChannel() {
        System.out.println("中国银行卡,使用中国银行还款渠道.");
    }
}
