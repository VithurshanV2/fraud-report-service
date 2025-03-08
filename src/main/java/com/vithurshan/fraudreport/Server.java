package com.vithurshan.fraudreport;

import javax.xml.ws.Endpoint;
import org.apache.cxf.ext.logging.LoggingFeature;

public class Server {
    public static void main(String[] args) throws Exception {
        FraudReportService implementor = new FraudReportServiceImpl();
        Endpoint.publish("http://localhost:9090/FraudReportService",
                implementor,
                new LoggingFeature());
        System.out.println("Server ready...");
    }
}