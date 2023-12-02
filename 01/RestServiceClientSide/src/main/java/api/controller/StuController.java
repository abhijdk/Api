package api.controller;

import api.pojo.Stu;
import api.restService.StuRestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class StuController {
    @Autowired
    private StuRestService stuRestService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAllData")
    public String getAllData(Model model) throws JsonProcessingException {
        model.addAttribute("view",stuRestService.receiveApi());
        return "getAllData";
    }

    @RequestMapping("/form")
    public String form(){ return  "form";}

    @RequestMapping("/insert")
    public String insert(@ModelAttribute Stu stu){
        String url = "http://localhost:9111/RestServiceServerSide/insert?id="+stu.getId()+"&name="+stu.getName()+"";
        restTemplate.postForObject(url,stu,Stu.class);
        return "redirect:/getAllData";
    }



    /*
     * Update One Particular Record from our database*/
    @RequestMapping("/update")
//    @ResponseBody
    public String update(@RequestParam int id,Model model) throws JsonProcessingException {
        model.addAttribute("stu",stuRestService.receiveApiforSingleData(id));
        return "update";
    }

    @RequestMapping("/insertUpdate")
//    @ResponseBody
    public String insertUpdate(@ModelAttribute Stu stu){
        String url = "http://localhost:9111/RestServiceServerSide/insertUpdate?name="+stu.getName()+"&id="+stu.getId()+"";
        restTemplate.postForObject(url,stu,Stu.class);
        return "redirect:/getAllData";
    }





    @RequestMapping("/delete")
    public String delete(@RequestParam int id){
        String url = "http://localhost:9111/RestServiceServerSide/delete?id="+id;
        restTemplate.delete(url);
        return "redirect:/getAllData";
    }
}