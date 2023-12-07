package com.classapiapplication.apiproject.Controller;

import com.classapiapplication.apiproject.Entity.Property;
import com.classapiapplication.apiproject.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
//Dummy Data
/*
{
    "address": "123 Main Street",
    "price": 150000.00
  }
*/
public class PropertyController {
    @Autowired
    private PropertyService propertyservice;
    @PostMapping
    //CREATE Property API
    //URL:
    //http://127.0.0.1:9090/property
    public Property createProperty(@RequestBody Property property) {
        return propertyservice.createProperty(property);
    }

    @GetMapping("/{id}")
    //GET Property by id API
    //URL:
    //http://127.0.0.1:9090/property/1
    public Property getPropertyById(@PathVariable Long id) {
        return propertyservice.getPropertyById(id);
    }

    @GetMapping
    //GET all Properties API
    //URL:
    //http://127.0.0.1:9090/property
    public List<Property> getAllPropertys() {
        return propertyservice.getAllPropertys();
    }

    @PutMapping("/{id}")
    //UPDATE Property API
    //URL:
    //http://127.0.0.1:9090/property/1
    public Property updateProperty(@PathVariable Long id, @RequestBody Property property) {
        Property.setId(id);
        return propertyservice.updateProperty(property);
    }

    @DeleteMapping("/{id}")
    //DLEATE Property API
    //URL:
    //http://127.0.0.1:9090/property/1
    public void deleteProperty(@PathVariable Long id) {
        propertyservice.deleteProperty(id);
    }
}
