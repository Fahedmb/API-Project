package com.classapiapplication.apiproject.Service;

import com.classapiapplication.apiproject.Entity.Owner;

import java.util.List;

public interface OwnerService {
    Owner createOwner(Owner owner);
    Owner updateOwner(Owner owner);
    Owner getOwnerById(Long id);
    List<Owner> getAllOwners();
    void deleteOwner(Long id);
}
