package org.turkovaleksey.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView mainPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/catalog/")
    public ModelAndView catalogPage() {return new ModelAndView("catalog"); }

    @GetMapping("/panel/")
    public ModelAndView panelPage() {
        return new ModelAndView("panel");
    }

    @GetMapping("/test/")
    public ModelAndView testPage() {
        return new ModelAndView("test");
    }

}
