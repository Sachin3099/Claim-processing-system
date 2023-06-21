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
    
        // @DeleteMapping("/claim/{id}")
        // public String deleteClaim(@PathVariable int id){
        //     return claimService.deleteClaim(id);
        // }

        //Generate additional endpoints in the ClaimController to trigger claim validation for specific claims and return the validation results
        @GetMapping("/claim/validate/{id}")
        public String validateClaim(@PathVariable int id){
            return claimService.validateClaim(id);
        }
   
        //Generate additional endpoints in the ClaimController to trigger claim approval for specific claims and return the approval results
        @GetMapping("/claim/approve/{id}")
        public String approveClaim(@PathVariable int id){
            return claimService.approveClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim rejection for specific claims and return the rejection results
        @GetMapping("/claim/reject/{id}")
        public String rejectClaim(@PathVariable int id){
            return claimService.rejectClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim settlement for specific claims and return the settlement results
        @GetMapping("/claim/settle/{id}")
        public String settleClaim(@PathVariable int id){
            return claimService.settleClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim denial for specific claims and return the denial results
        @GetMapping("/claim/deny/{id}")
        public String denyClaim(@PathVariable int id){
            return claimService.denyClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim cancellation for specific claims and return the cancellation results
        @GetMapping("/claim/cancel/{id}")
        public String cancelClaim(@PathVariable int id){
            return claimService.cancelClaim(id);
        }


        //Generate additional endpoints in the ClaimController to trigger claim payment for specific claims and return the payment results
        @GetMapping("/claim/pay/{id}")
        public String payClaim(@PathVariable int id){
            return claimService.payClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim payment status for specific claims and return the payment status results
        @GetMapping("/claim/paymentStatus/{id}")
        public String paymentStatusClaim(@PathVariable int id){
            return claimService.paymentStatusClaim(id);
        }

        //Generate additional endpoints in the ClaimController to trigger claim settlement offer for specific claims and return the settlement offer results
        @GetMapping("/claim/settlementOffer/{id}")
        public String settlementOfferClaim(@PathVariable int id){
            return claimService.settlementOfferClaim(id);
        }

        //Include mechanisms to integrate with payment gateways or banking systems to facilitate secure and timely claim payments.
        //Generate additional endpoints in the ClaimController to trigger claim settlement offer status for specific claims and return the settlement offer status results
        @GetMapping("/claim/settlementOfferStatus/{id}")
        public String settlementOfferStatusClaim(@PathVariable int id){
            return claimService.settlementOfferStatusClaim(id);
        // }

        //Implement a service class to integrate with a payment gateway for claim payments, including methods to initiate payment transactions and handle payment callbacks.
        

        



    }
}


