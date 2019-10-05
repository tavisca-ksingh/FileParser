package com.example.DataService.Service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public class DataServiceDAO {

     @Autowired
    private ServiceRepository serviceRepository;

    public List<Data_service> reteriveAllItems(){
        return serviceRepository.findAll();
    }


    public void xml_File(){


    }




}
