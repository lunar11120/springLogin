/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.am.springLogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Theam
 */
@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Hello from HomeController";
    }
    
    @GetMapping("/secured")
    public String secured(){
        return "Secured Controller : welcome";
    }    
    
}
