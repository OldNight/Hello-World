package web.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class LoginController {
//    @RequestMapping(value = "/user/index", method = RequestMethod.GET)
    @PostMapping(value = "/user/index")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            return "redirect:/main.html";
        }else{
            map.put("mag","用户名密码错误");
            return "index";
        }

    }
}
