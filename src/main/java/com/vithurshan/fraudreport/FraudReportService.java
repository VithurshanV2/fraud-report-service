package com.vithurshan.fraudreport;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface FraudReportService {
    @WebMethod
    boolean reportFraud(String sellerID, String reason);

    @WebMethod
    int getReportCount(String sellerID);
}
