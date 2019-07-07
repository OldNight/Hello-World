package com.example.demo;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    //一
    //@PostMapping("/")
    @RequestMapping(value = "/")
    public String Hello(){
        return "Hello World!";
    }


    //二
   /* @RequestMapping(value="/hello/{id}/{name}",method = RequestMethod.GET)                   //PathVaribale获取url路径的数据
    public String Hello(@PathVariable("id") Integer id, @PathVariable("name") String name){    //eg：浏览器输入localhost:8080/hello/(数值)/(字符)
        return "id:"+id+"name;"+name;
    }*/



  /* @RequestMapping(value = "/hello",method = RequestMethod.GET)                         //获取url参数值的默认方式
    public String Hello(@RequestParam Integer id){                                        //locahost:8080/hello?id=(数字)
       return "id:"+id;
   }*/



  @RequestMapping(value = "/hello")                       //url中有多个参数时
    public String Hello(@RequestParam Integer id,@RequestParam String name){             //localhost:8080/hello?id=98&&name=helloworld
      return "id:"+id+"name:"+name;
  }



  /*@RequestMapping(value = "/hello",method = RequestMethod.GET)                        //method = RequestMethod.GET:
    public String Hello(@RequestParam("userId") Integer id){
      return "id:"+id;
  }*/



  /*@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(@RequestParam(value="id:",required = false,defaultValue = "1")Integer id){
      return "id:"+id;
  }*/


    @PostMapping("/postID")
    public String getlnteger(@RequestBody Map<String, Object> map){
        String id = (String) map.get("if");
        System.out.println(id);
        return id;
    }
}


