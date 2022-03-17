package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    @Qualifier("appName")
    private String appName;

    @Autowired
    @Qualifier("appVersion")
    private String appVersion;

    @GetMapping(value="/")
    public String getAppName () {
        return appName + "\n" + appVersion;
    }    
}
