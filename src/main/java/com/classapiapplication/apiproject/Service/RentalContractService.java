package com.classapiapplication.apiproject.Service;

import com.classapiapplication.apiproject.Entity.RentalContract;

import java.util.List;

public interface RentalContractService {
    RentalContract createRentalContract(RentalContract rentalcontract);
    RentalContract updateRentalContract(RentalContract rentalcontract);
    RentalContract getRentalContractById(Long id);
    List<RentalContract> getAllRentalContracts();
    void deleteRentalContract(Long id);
}
