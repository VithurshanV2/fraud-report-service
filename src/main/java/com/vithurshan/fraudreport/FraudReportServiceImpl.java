package com.vithurshan.fraudreport;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService
public class FraudReportServiceImpl implements FraudReportService {
    private static Map<String, Integer> reportedSellers = new HashMap<>();

    @Override
    public boolean reportFraud(String sellerID, String reason) {
        if (reason != null && !reason.isEmpty()) {
            Integer count = reportedSellers.get(sellerID);
            if (count != null) {
                reportedSellers.put(sellerID, count + 1);
            } else {
                reportedSellers.put(sellerID, 1);
            }
            return true;
        }
        return false;
    }

    @Override
    public int getReportCount(String sellerID) {
        Integer count = reportedSellers.get(sellerID);
        return (count != null) ? count : 0;
    }
}
