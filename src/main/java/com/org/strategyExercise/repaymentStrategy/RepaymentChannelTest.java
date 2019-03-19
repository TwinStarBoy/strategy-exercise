package com.org.strategyExercise.repaymentStrategy;

public class RepaymentChannelTest {
    public static void main(String[] args) {
        String repaymentChannelName = "ICBC";
        RepaymentChannel repaymentChannel = RepaymentChannelFactory.getRepaymentChannel(repaymentChannelName);
        repaymentChannel.printChannel();
    }
}
