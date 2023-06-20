package com.stackroute.ClaimProcessingSystem;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Claim {
   //Generate a Claim class with attributes like claim number, policy number, date, status, and description
    //mARK CLAIM NUMBER AS PRIMARY KEY
    @Id
    private int claimNumber;
    private int policyNumber;
    private String date;
    private String status;
    private String description;

    //Generate getters and setters
    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }
    public int getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
          return status;
     }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescription() {
          return description;
     }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getClaimAmount() {
        return 0;
    }
    






}
