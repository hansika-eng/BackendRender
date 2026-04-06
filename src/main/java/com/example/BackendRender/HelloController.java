package com.example.BackendRender;
import org.springframework.web.bind.annotation.*; 
@CrossOrigin(origins = "***") 
@RestController 
@RequestMapping("/api") 
public class HelloController { 
    @GetMapping("/hello") 
public String hello() { 
return "Hello from Spring Boot ";    
    } 
} 