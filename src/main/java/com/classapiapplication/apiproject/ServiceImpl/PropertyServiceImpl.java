package com.classapiapplication.apiproject.ServiceImpl;

import com.classapiapplication.apiproject.Entity.Property;
import com.classapiapplication.apiproject.Repository.PropertyRepository;
import com.classapiapplication.apiproject.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyrepository;

    @Override
    public Property createProperty(Property property) {
        return propertyrepository.save(property);
    }

    @Override
    public Property updateProperty(Property property) {
        return propertyrepository.save(property);
    }

    @Override
    public Property getPropertyById(Long id) {
        return propertyrepository.findById(id).orElse(null);
    }

    @Override
    public List<Property> getAllPropertys() {
        return propertyrepository.findAll();
    }

    @Override
    public void deleteProperty(Long id) {
        propertyrepository.deleteById(id);
    }
}
