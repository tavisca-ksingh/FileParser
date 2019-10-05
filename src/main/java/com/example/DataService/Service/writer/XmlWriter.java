package com.example.DataService.Service.writer;

import com.example.DataService.Service.Data_service;
import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlWriter  implements Writer {

    @Override
    public void writerList(List list) throws IOException {
        XmlMapper mapper = new XmlMapper();

        mapper.writerWithDefaultPrettyPrinter()
                . writeValue(new File("demo.xml"), list);
        File file = new File("demo.xml");
    }
}
