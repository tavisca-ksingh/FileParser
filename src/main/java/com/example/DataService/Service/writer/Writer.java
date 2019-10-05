package com.example.DataService.Service.writer;

import java.io.IOException;
import java.util.List;

public interface Writer<Data_service> {

    public void writerList(List<Data_service> list) throws IOException;

}
