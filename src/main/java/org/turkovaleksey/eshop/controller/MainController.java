package org.turkovaleksey.eshop.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.product.Photo;
import org.turkovaleksey.eshop.service.impl.PhoneServiceImpl;

import java.util.List;

@Controller
public class MainController {

    private PhoneServiceImpl phoneService;

    @Autowired
    public void setPhoneService(PhoneServiceImpl phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("/")
    public ModelAndView mainPage() {
        return new ModelAndView("index");
    }

    @GetMapping("/catalog/")
    public ModelAndView catalogPage() {return new ModelAndView("catalog"); }

    @GetMapping("/panel/")
    public ModelAndView panelPage() {
        ModelAndView modelAndView = new ModelAndView("panel");
        try {
            modelAndView.addObject("phoneInfo", phoneService.getMinInfo());
        } catch (RuntimeException e) {
            modelAndView.addObject("mess", "Error add");
        }
        return modelAndView;
    }

    @GetMapping("/test/")
    public ModelAndView testPage() {
        return new ModelAndView("test");
    }

}
