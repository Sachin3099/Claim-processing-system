//Create a ClaimRepository interface to define database operations for the Claim entity for H2 database
package com.stackroute.ClaimProcessingSystem.repository;
import com.stackroute.ClaimProcessingSystem.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}









