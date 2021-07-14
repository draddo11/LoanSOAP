package com.nana.soap.api.endpiont;

import com.nana.soap.api.loaneligibility.Acknowledgement;
import com.nana.soap.api.loaneligibility.CustomerRequest;
import com.nana.soap.api.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityIndicatorEndpoint {
    private static final String NAMESPACE = "http://www.nana.com/soap/api/loanEligibility";

    @Autowired
    private LoanEligibilityService service;

    @PayloadRoot(namespace = NAMESPACE,localPart = "CustomerRequest")

    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request){
        return service.checkLoanEligibility(request);
    }
}
