//Generate  endpoints to handle claim-related operations, including claim submission by policyholders



package com.stackroute.ClaimProcessingSystem;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

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



