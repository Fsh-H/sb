package cn.fsh.controller;

import cn.fsh.entity.Person;
import cn.fsh.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author FSH
 * version 1.0
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/Hello.do",method = RequestMethod.POST)
    public String hello(String uname){
        System.out.println("hello springmvc"+uname);
        return "index";
    }

    /**
     * @RequestParam("name") name为uname的别名
     * @param uname
     * @return
     */
    @RequestMapping(value = "/Hello1.do",method = RequestMethod.POST)
    public String hello1(@RequestParam("name") String uname){
        System.out.println("hello springmvc"+uname);

        return "index";
    }

    @RequestMapping(value = "/Hello2.do",method = RequestMethod.POST)
    public String hello2(Role role){
        System.out.println("角色："+role);

        return "index";
    }

    @RequestMapping(value = "/Hello3.do",method = RequestMethod.POST)
    public String hello3(Person person){
        System.out.println(person);
        return "index";
    }
}
