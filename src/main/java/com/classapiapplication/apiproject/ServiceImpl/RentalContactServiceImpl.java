package com.classapiapplication.apiproject.ServiceImpl;

import com.classapiapplication.apiproject.Entity.RentalContract;
import com.classapiapplication.apiproject.Repository.RentalContractRepository;
import com.classapiapplication.apiproject.Service.RentalContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RentalContactServiceImpl implements RentalContractService {
    @Autowired
    private RentalContractRepository rentalcontractrepository;

    @Override
    public RentalContract createRentalContract(RentalContract rentalcontract) {
        return rentalcontractrepository.save(rentalcontract);
    }

    @Override
    public RentalContract updateRentalContract(RentalContract rentalcontract) {
        return rentalcontractrepository.save(rentalcontract);
    }

    @Override
    public RentalContract getRentalContractById(Long id) {
        return rentalcontractrepository.findById(id).orElse(null);
    }

    @Override
    public List<RentalContract> getAllRentalContracts() {
        return rentalcontractrepository.findAll();
    }

    @Override
    public void deleteRentalContract(Long id) {
        rentalcontractrepository.deleteById(id);
    }
}
