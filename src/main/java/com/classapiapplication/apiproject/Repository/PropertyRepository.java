package com.classapiapplication.apiproject.Repository;

import com.classapiapplication.apiproject.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    Property findByAddress(String name);
    Optional<Property> findByid(Long id);
    Boolean existsByid(Long id);
}
