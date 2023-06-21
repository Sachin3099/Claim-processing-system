//Implement a service class to perform claim validation, including checks for policy coverage, claim amount, and supporting documents


package com.stackroute.ClaimProcessingSystem.service;

import java.util.List;

import com.stackroute.ClaimProcessingSystem.model.Claim;
import com.stackroute.ClaimProcessingSystem.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim saveClaim(Claim claim) {
        claim.setStatus("Submitted");
        return claimRepository.save(claim);

    }

    @Override
    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public Claim getClaimById(int id) {
        return claimRepository.findById(id).get();
    }

    @Override
    public Claim updateClaim(int id, Claim claim) {
        Claim claim1 = claimRepository.findById(id).get();
        claim1.setClaimNumber(claim.getClaimNumber());
        claim1.setPolicyNumber(claim.getPolicyNumber());
        claim1.setDate(claim.getDate());
        claim1.setStatus(claim.getStatus());
        claim1.setDescription(claim.getDescription());
        return claimRepository.save(claim1);
    }

    @Override
    public String deleteClaim(int id) {
        claimRepository.deleteById(id);
        return "Claim deleted";
    }

    //Write a java method for validate a claim and status as validated

    @Override

    public String validateClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Submitted")){
            claim.setStatus("Validated");
            claimRepository.save(claim);
            return "Claim validated";
        }
        else{
            return "Claim not validated";
        }
    }


      



    @Override
    public String approveClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Validated")){
            claim.setStatus("Approved");
            claimRepository.save(claim);
            return "Claim approved";
        }
        else{
            return "Claim not approved";
        }
    }

    @Override
    public String rejectClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Validated")){
            claim.setStatus("Rejected");
            claimRepository.save(claim);
            return "Claim rejected";
        }
        else{
            return "Claim not rejected";
        }
    }

    @Override

    public String settleClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Approved")){
            claim.setStatus("Settled");
            claimRepository.save(claim);
            return "Claim settled";
        }
        else{
            return "Claim not settled";
        }
    }

    @Override
    public String cancelClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Approved")){
            claim.setStatus("Cancelled");
            claimRepository.save(claim);
            return "Claim cancelled";
        }
        else{
            return "Claim not cancelled";
        }
    }

    @Override
    public String denyClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Approved")){
            claim.setStatus("Denied");
            claimRepository.save(claim);
            return "Claim denied";
        }
        else{
            return "Claim not denied";
        }
    }

    @Override

    public String payClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Settled")){
            claim.setStatus("Paid");
            claimRepository.save(claim);
            return "Claim paid";
        }
        else{
            return "Claim not paid";
        }
    }

    @Override

    public String paymentStatusClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Paid")){
            return "Claim paid";
        }
        else{
            return "Claim not paid";
        }
    }

    @Override

    public String settlementOfferClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Approved")){
            claim.setStatus("Settlement Offered");
            claimRepository.save(claim);
            return "Settlement offered";
        }
        else{
            return "Settlement not offered";
        }
    }

    @Override

    public String settlementOfferStatusClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getStatus().equals("Settlement Offered")){
            return "Settlement offered";
        }
        else{
            return "Settlement not offered";
        }
    }



    
}
