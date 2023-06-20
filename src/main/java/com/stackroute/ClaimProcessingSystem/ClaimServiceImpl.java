//Implement a service class to perform claim validation, including checks for policy coverage, claim amount, and supporting documents


package com.stackroute.ClaimProcessingSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public Claim saveClaim(Claim claim) {
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

    @Override
    public String validateClaim(int id) {
        Claim claim = claimRepository.findById(id).get();
        if(claim.getClaimAmount() > 10000){
            return "Claim amount is greater than 10000";
        }
        else{
            return "Claim amount is less than 10000";
        }
    }

    
}
