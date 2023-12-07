package com.classapiapplication.apiproject.Service;

import com.classapiapplication.apiproject.Entity.Property;

import java.util.List;

public interface PropertyService {
    Property createProperty(Property property);
    Property updateProperty(Property property);
    Property getPropertyById(Long id);
    List<Property> getAllPropertys();
    void deleteProperty(Long id);
}
