package com.classapiapplication.apiproject.Controller;

import com.classapiapplication.apiproject.Entity.RentalContract;
import com.classapiapplication.apiproject.Service.RentalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/rentalcontract")
//Dummy Data
/*
  {
    "tenant": "Example ben_Example",
    "monthlyRent": 2500.00,
    "owner_id":1,
    "property_id": 1
  }
*/
public class RentalContractController {
    @Autowired
    private RentalContractService rentalcontractservice;
    @PostMapping
    //CREATE RentalContract API
    //URL:
    //http://127.0.0.1:9090/rentalcontract
    public RentalContract createRentalContract(@RequestBody RentalContract rentalcontract) {
        return rentalcontractservice.createRentalContract(rentalcontract);
    }

    @GetMapping("/{id}")
    //GET RentalContract by id API
    //URL:
    //http://127.0.0.1:9090/rentalcontract/1
    public RentalContract getRentalContractById(@PathVariable Long id) {
        return rentalcontractservice.getRentalContractById(id);
    }

    @GetMapping
    //GET ALL RentalContract API
    //URL:
    //http://127.0.0.1:9090/rentalcontract
    public List<RentalContract> getAllRentalContracts() {
        return rentalcontractservice.getAllRentalContracts();
    }

    @PutMapping("/{id}")
    //UPDATE RentalContract API
    //URL:
    //http://127.0.0.1:9090/rentalcontract/1
    public RentalContract updateRentalContract(@PathVariable Long id, @RequestBody RentalContract rentalcontract) {
        RentalContract.setId(id);
        return rentalcontractservice.updateRentalContract(rentalcontract);
    }

    @DeleteMapping("/{id}")
    //DELETE RentalContract by id API
    //URL:
    //http://127.0.0.1:9090/rentalcontract/1
    public void deleteRentalContract(@PathVariable Long id) {
        rentalcontractservice.deleteRentalContract(id);
    }
}
