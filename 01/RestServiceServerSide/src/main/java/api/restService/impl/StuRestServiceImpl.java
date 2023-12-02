package api.restService.impl;

import api.pojo.College;
import api.restService.StuRestService;
import api.service.StuService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StuRestServiceImpl implements StuRestService {

    StuService stuService;
    @Override
    public String giveApi() throws JsonProcessingException {
        College college=new College();
        college.setStu(stuService.getAllStudent());

        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(college);
    }

    public StuService getStuService() {
        return stuService;
    }

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
