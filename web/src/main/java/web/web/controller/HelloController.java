package web.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

 //   @RequestMapping("/")
   // public String index(){
     //   return "index";
    //}



    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("muda","mudamudamudamuda!!!!!!");
        return "success";
    }
}
