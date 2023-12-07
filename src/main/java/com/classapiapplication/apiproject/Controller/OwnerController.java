package com.classapiapplication.apiproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.classapiapplication.apiproject.Service.OwnerService;
import com.classapiapplication.apiproject.Entity.Owner;

import java.util.List;

@RestController
@RequestMapping("/owner")
//Dummy data
/*
  {
    "name": "test",
    "contactInformation": "test@example.com"
  }
*/
public class OwnerController {
    @Autowired
    private OwnerService ownerservice;
    @PostMapping
    //CREATE Owner API
    //URL:
    //http://127.0.0.1:9090/owner
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerservice.createOwner(owner);
    }

    @GetMapping("/{id}")
    //GET Owner by id API
    //URL:
    //http://127.0.0.1:9090/owner/1
    public Owner getOwnerById(@PathVariable Long id) {
        return ownerservice.getOwnerById(id);
    }

    @GetMapping
    //GET ALL Owners API
    //URL:
    //http://127.0.0.1:9090/owner
    public List<Owner> getAllOwners() {
        return ownerservice.getAllOwners();
    }

    @PutMapping("/{id}")
    //UPDATE Owner API
    //URL:
    //http://127.0.0.1:9090/owner/1
    public Owner updateOwner(@PathVariable Long id, @RequestBody Owner owner) {
        Owner.setId(id);
        return ownerservice.updateOwner(owner);
    }

    @DeleteMapping("/{id}")
    //DLEATE Owner API
    //URL:
    //http://127.0.0.1:9090/owner/1
    public void deleteOwner(@PathVariable Long id) {
        ownerservice.deleteOwner(id);
    }

}
