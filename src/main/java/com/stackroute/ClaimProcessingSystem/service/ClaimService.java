//Implement a service class that handles the business logic for claims, including claim validation and eligibility checks.

package com.stackroute.ClaimProcessingSystem.service;

import java.util.List;

import com.stackroute.ClaimProcessingSystem.model.Claim;
import org.springframework.stereotype.Service;

@Service
public interface ClaimService{
    public Claim saveClaim(Claim claim);
    public List<Claim> getAllClaims();
    public Claim getClaimById(int id);
    public Claim updateClaim(int id, Claim claim);
    public String deleteClaim(int id);
    public String validateClaim(int id);
    public String approveClaim(int id);
    public String rejectClaim(int id);
    public String settleClaim(int id);
    public String cancelClaim(int id);
    public String denyClaim(int id);
    public String payClaim(int id);
    public String paymentStatusClaim(int id);
    public String settlementOfferClaim(int id);
    public String settlementOfferStatusClaim(int id);


}

