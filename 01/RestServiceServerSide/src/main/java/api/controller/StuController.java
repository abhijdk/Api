package api.controller;

import api.pojo.College;
import api.pojo.Stu;
import api.restService.StuRestService;
import api.service.impl.StuServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StuController {
    @Autowired
    private StuRestService stuRestService;
    @Autowired
    private StuServiceImpl stuService;

    /*
    * Get Data in json format*/
    @GetMapping("/getAllData")
    @ResponseBody
    public String getAllData() throws JsonProcessingException {
        return stuRestService.giveApi();
    }

    /*
     * Get Data in JSP format*/
    @GetMapping("/getAllData2")
    public String getAllData2(Model model) throws JsonProcessingException {
        model.addAttribute("view",stuService.getAllStudent());
        return "getAllData";
    }


    @RequestMapping("/getSingleData/{id}")
    @ResponseBody
    public Stu getSingleData(@PathVariable int id){
        return stuService.getSingleStudent(id);
    }

    /*
    * form for Insert new record into database*/
    @RequestMapping("/form")
    public String form(){ return "form";}
    /*
     * Insert new record into database*/
    @RequestMapping("/insert")
    public String insert(@ModelAttribute ("stu") Stu  stu){
        stuService.insert(stu);
        return "redirect:/getAllData2";
    }

    /*
     * Delete One Record from our database*/
    @RequestMapping("/update")
//    @ResponseBody
    public String update(@RequestParam int id,Model model){
        model.addAttribute("stu",stuService.getSingleStudent(id));
        return "update";
    }

    @RequestMapping("/insertUpdate")
//    @ResponseBody
    public String insertUpdate(@ModelAttribute Stu stu){
        stuService.update(stu);
        return "redirect:/getAllData2";
    }

    /*
    * Delete One Record from our database*/
    @RequestMapping("/delete")
//    @ResponseBody
    public String delete(@RequestParam int id){
        stuService.delete(id);
        System.out.println(id);
        return "redirect:/getAllData2";
    }
}
