package com.example.vscode_java_debug_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ServiceController {

    
    @GetMapping
    public String apiEndpoint(){
        return "hello";
    }
}
