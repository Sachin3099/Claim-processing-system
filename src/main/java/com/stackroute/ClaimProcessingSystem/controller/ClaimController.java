//Generate  endpoints to handle claim-related operations, including claim submission by policyholders



package com.stackroute.ClaimProcessingSystem.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.ClaimProcessingSystem.service.ClaimService;
import com.stackroute.ClaimProcessingSystem.model.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ClaimController {
  
        @Autowired
         private ClaimService claimService;

        //Autowire the ClaimService interface in the ClaimController class
        // @Autowired
        // public ClaimController(ClaimService claimService) {
        //     this.claimService = claimService;
        // }

        @PostMapping("/claim")
        public Claim saveClaim(@RequestBody Claim claim){
            return claimService.saveClaim(claim);
        }
    
        @GetMapping("/claim")
        public List<Claim> getAllClaims(){
            return claimService.getAllClaims();
        }
    
        @GetMapping("/claim/{id}")
        public Claim getClaimById(@PathVariable int id){
            return claimService.getClaimById(id);
        }
    
        @PutMapping("/claim/{id}")
        public Claim updateClaim(@PathVariable int id, @RequestBody Claim claim){
            return claimService.updateClaim(id, claim);
        }
    
        @DeleteMapping("/claim/{id}")
        public String deleteClaim(@PathVariable int id){
            return claimService.deleteClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim validation for specific claims and return the validation results
        @GetMapping("/claim/validate/{id}")
        public String validateClaim(@PathVariable int id){
            return claimService.validateClaim(id);
        }


    }



