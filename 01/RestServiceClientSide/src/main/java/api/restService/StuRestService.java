package api.restService;

import api.pojo.College;
import api.pojo.Stu;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface StuRestService {
    public College receiveApi() throws JsonProcessingException;
    public Stu receiveApiforSingleData(int id) throws JsonProcessingException;

}