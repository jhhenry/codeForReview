package org.jhhenry.codeforreview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Hello for home";
    }

    @RequestMapping("/toJspFile")
    public String jspPath() {
        return "home";
    }
}
