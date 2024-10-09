package com.example.Postit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.example.Postit.Tags;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView RotaBase() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/tags")
    public ModelAndView RotaTags() {
        ModelAndView mv = new ModelAndView("tags");
       // Tags t = new Tags();
        // t.tag = tags;
        // t.id_tag = id_tag;
        return mv;
    }

    @GetMapping("/informacoes")
    public ModelAndView RotaInformacoes() {
        ModelAndView mv = new ModelAndView("informacoes");
        return mv;
    }

    @GetMapping("/buscar")
    public ModelAndView RotaBuscar() {
        ModelAndView mv = new ModelAndView("buscar");
        return mv;
    }

}
