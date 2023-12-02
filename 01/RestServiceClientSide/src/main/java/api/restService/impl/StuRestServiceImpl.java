package api.restService.impl;

import api.pojo.College;
import api.pojo.Stu;
import api.restService.StuRestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.client.RestTemplate;

public class StuRestServiceImpl implements StuRestService {
    private RestTemplate restTemplate;
    @Override
    public College receiveApi() throws JsonProcessingException {
        String url = "http://localhost:9111/RestServiceServerSide/getAllData";
        return restTemplate.getForObject(url,College.class);
    }

    @Override
    public Stu receiveApiforSingleData(int id) throws JsonProcessingException {
        String url = "http://localhost:9111/RestServiceServerSide/getSingleData/"+id;
        return restTemplate.getForObject(url, Stu.class);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
