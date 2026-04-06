package com.example.BackendRender;
import org.springframework.web.bind.annotation.*; 
@CrossOrigin(origins = "https://frontendrender-v40z.onrender.com") 
@RestController 
@RequestMapping("/api") 
public class HelloController { 
    @GetMapping("/hello") 
public String hello() { 
return "Hello from Spring Boot ";    
    } 
} 