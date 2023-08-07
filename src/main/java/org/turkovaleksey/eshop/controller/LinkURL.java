package org.turkovaleksey.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LinkURL {

    @ModelAttribute("phoneSave")
    public String phoneSave() {
        return "/catalog/phones/save";
    }

    @ModelAttribute("phones")
    public String allPhones() {
        return "/catalog/phones/";
    }

}
