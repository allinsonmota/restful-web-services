package com.allinsonmota.rest.webservices.restfullwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/")
    public String helloWord () {
        return "Hola mundo";
    }

    @GetMapping("/hello-world-internationalized")
    public String helloWordInternationalaized () {
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }
}
