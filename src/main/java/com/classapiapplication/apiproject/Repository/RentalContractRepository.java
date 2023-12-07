package com.classapiapplication.apiproject.Repository;

import com.classapiapplication.apiproject.Entity.RentalContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RentalContractRepository extends JpaRepository<RentalContract, Long> {
    RentalContract findBytenant(String name);
    Optional<RentalContract> findByid(Long id);
    Boolean existsByid(Long id);
}
