package com.classapiapplication.apiproject.ServiceImpl;

import com.classapiapplication.apiproject.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.classapiapplication.apiproject.Repository.OwnerRepository;
import com.classapiapplication.apiproject.Entity.Owner;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerrepository;

    @Override
    public Owner createOwner(Owner owner) {
        return ownerrepository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerrepository.save(owner);
    }

    @Override
    public Owner getOwnerById(Long id) {
        return ownerrepository.findById(id).orElse(null);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerrepository.findAll();
    }

    @Override
    public void deleteOwner(Long id) {
        ownerrepository.deleteById(id);
    }

}
