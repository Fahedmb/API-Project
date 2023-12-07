package com.classapiapplication.apiproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "rentalcontract")
//Entity structure in database:
//https://prnt.sc/73cE6oA6F2Nl
public class RentalContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tenant;
    private double monthlyRent;

    //Visualization of class diagram:
    //https://prnt.sc/g-8EizzIKDBd

    //Each rental contracts CAN have only one properties in it.
    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    //Each rental contract CAN have one and only one owner.
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public static void setId(Long id) {
        id = id;
    }
}
