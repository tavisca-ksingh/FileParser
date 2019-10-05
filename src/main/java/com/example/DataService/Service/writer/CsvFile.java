package com.example.DataService.Service.writer;

import com.example.DataService.Service.Data_service;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvFile implements Writer  {
    @Override
    public void writerList(List list) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = csvMapper.schemaFor(Data_service.class);
        csvMapper
                .writer(schema)
                .writeValue(new File("csvFile.csv"), list);
    }
}
