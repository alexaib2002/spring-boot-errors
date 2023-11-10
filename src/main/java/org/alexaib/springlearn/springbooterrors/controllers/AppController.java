package org.alexaib.springlearn.springbooterrors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/index")
    public String index() {
        int val = Integer.parseInt("asdf");
        return "index";
    }

}
