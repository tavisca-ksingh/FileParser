package com.example.DataService.Service;

import com.example.DataService.Service.writer.CsvFile;
import com.example.DataService.Service.writer.JsonWriter;
import com.example.DataService.Service.writer.Writer;
import com.example.DataService.Service.writer.XmlWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class ServiceController {

    @Autowired
    private DataServiceDAO dataServiceDAO;

    Writer writer;
    @GetMapping(path="dataService")
    public List<Data_service> retrieveAllItems() {
        return dataServiceDAO.reteriveAllItems();
    }

    @GetMapping(path="xmlFile")
    public String writeXML() throws IOException {
        writer = new XmlWriter();
        writer.writerList(dataServiceDAO.reteriveAllItems());
        return "xml data Saved ";
    }

    @GetMapping(path="jsonFile")
    public String writeJson() throws IOException {
        writer = new JsonWriter();
        writer.writerList(dataServiceDAO.reteriveAllItems());
        return "json data Saved ";
    }

    @GetMapping(path="csvFile")
    public String writeCSV() throws IOException {
        writer = new CsvFile();
        writer.writerList(dataServiceDAO.reteriveAllItems());
        return "CSV data Saved ";
    }

}
