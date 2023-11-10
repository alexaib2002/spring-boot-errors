package org.alexaib.springlearn.springbooterrors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/index")
    public String index() {
        int val = 100 / 0;
        return "index";
    }

}
