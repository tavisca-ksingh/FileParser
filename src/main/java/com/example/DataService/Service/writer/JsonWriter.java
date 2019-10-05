package com.example.DataService.Service.writer;

import com.fasterxml.jackson.xml.XmlMapper;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonWriter implements  Writer {
    @Override
    public void writerList(List list) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.writeValue(new File("jsonFile.json"),list);
    }
}
