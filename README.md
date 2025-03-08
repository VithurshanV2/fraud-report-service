# fraud-report-service

This project is a SOAP-based web service developed to report fraudulent sellers within an online marketplace. Users can submit a request containing a seller's ID to check if the seller is flagged as fraudulent. The web service processes the request and returns a response confirming whether the seller is marked as fraudulent or not.
### Prerequisites
- JDK 11
- SOAP UI (for testing the service)
### How to Use
1. Clone this repository to your local machine:
	- `https://github.com/VithurshanV2/fraud-report-service.git`
2. Open the project in your IDE.
3. Run the following commands in the terminal:
    - `mvn clean install`: This will build the project and download required dependencies.
	- `mvn -Pserver`: This will start the SOAP web service server.
4. Open SOAP UI and import the fraud-report-service-test-soapui-project.xml file located in the SOAPUI folder.
5. Use the URL http://localhost:9090/FraudReportService?wsdl in SOAP UI to test the service.
### Report Fraud
To report a fraudulent seller, use the following SOAP request. You should replace the values as follows:
- `<arg0>`: The seller's ID (ex: S12345671)
- `<arg1>`: The reason for reporting the seller
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:fra="http://fraudreport.vithurshan.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <fra:reportFraud>
         <!--Optional:-->
         <arg0>?</arg0> <!-- Seller ID -->
         <!--Optional:-->
         <arg1>?</arg1> <!-- Reason for reporting -->
      </fra:reportFraud>
   </soapenv:Body>
</soapenv:Envelope>
```
### Get Report Count
To retrieve the report count for a specific seller, use this request structure. Replace the values as follows:
- `<arg0>`: The seller's ID (ex: S12345671)
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:fra="http://fraudreport.vithurshan.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <fra:getReportCount>
         <!--Optional:-->
         <arg0>?</arg0> <!-- Seller ID -->
      </fra:getReportCount>
   </soapenv:Body>
</soapenv:Envelope>
```