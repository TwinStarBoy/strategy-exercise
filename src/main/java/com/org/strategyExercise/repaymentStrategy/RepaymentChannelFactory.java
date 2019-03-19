package com.org.strategyExercise.repaymentStrategy;

import java.util.HashMap;
import java.util.Map;

public class RepaymentChannelFactory {

    private static Map<String,RepaymentChannel> bankChannelMap = new HashMap<String, RepaymentChannel>();

    static {
        bankChannelMap.put(BankName.ABC , new ABCRepaymentChannel());
        bankChannelMap.put(BankName.BOC , new BOCRepaymentChannel());
        bankChannelMap.put(BankName.CCB , new CCBRepaymentChannel());
        bankChannelMap.put(BankName.CITC , new CITICRepaymentChannel());
        bankChannelMap.put(BankName.ICBC , new ICBCRepaymentChannel());
    }

    public static RepaymentChannel getRepaymentChannel(String repaymentChannelName){
        RepaymentChannel repaymentChannel =  bankChannelMap.get(repaymentChannelName);
        repaymentChannel = (repaymentChannel == null ? new WalletRepaymentChannel() : repaymentChannel );
        return repaymentChannel;
    }

    private interface BankName{
        String ABC = "ABC";
        String BOC = "BOC";
        String CCB = "CCB";
        String CITC = "CITC";
        String ICBC = "ICBC";
    }


}
