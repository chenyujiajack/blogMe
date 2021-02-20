package com.yu.web;


import com.yu.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
    //    int i = 9/0;

        return "index";
    }
    @GetMapping("/blog")
    public String blog(){
        //    int i = 9/0;

        return "blog";
    }

}
