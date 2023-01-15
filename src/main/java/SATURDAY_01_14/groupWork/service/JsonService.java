package SATURDAY_01_14.groupWork.service;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonService {


    public void transferListToJson(List list, String fileName) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName +".json"), list);
    }
}
