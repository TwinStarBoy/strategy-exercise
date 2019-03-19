package com.org.strategyExercise.repaymentStrategy;

public class CITICRepaymentChannel implements RepaymentChannel{
    public void printChannel() {
        System.out.println("中信银行卡,使用中信银行还款渠道.");
    }
}
