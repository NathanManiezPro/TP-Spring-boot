package fr.nathan.demos.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping //GET sur http://localhost:8080/hello
    public String hello(){
        return "GET sur HelloWorld ! ";
    }

    @PostMapping
    public String helloworld(){
        return "POST sur HelloWorld ! ";
    }

    @PutMapping
    public String helloPut(){
        return "PUT sur HelloWorld haha ! ";
    }

}
