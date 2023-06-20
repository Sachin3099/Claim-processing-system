//Implement a service class that handles the business logic for claims, including claim validation and eligibility checks.

package com.stackroute.ClaimProcessingSystem;

import java.util.List;


public interface ClaimService{
    public Claim saveClaim(Claim claim);
    public List<Claim> getAllClaims();
    public Claim getClaimById(int id);
    public Claim updateClaim(int id, Claim claim);
    public String deleteClaim(int id);
    public String validateClaim(int id);
}

