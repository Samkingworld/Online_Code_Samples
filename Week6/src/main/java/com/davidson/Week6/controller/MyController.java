package com.davidson.Week6.controller;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/controller")
public class MyController {

    private final List<String> postedGreetings = new ArrayList<>();
    Map<String, String> mappedString = new HashMap<>();
    private int count = 1;


    @PostMapping("/greeting")
    public ResponseEntity<String> postGreeting(@RequestBody String greeting){

        LocalDate date = LocalDate.now();
        String postedTime = date + "" + count++;
        mappedString.put(postedTime, greeting);
        postedGreetings.add(greeting);
        return ResponseEntity.ok(String.format("String: \"%s\" , was saved in the list", greeting));
    }

    @GetMapping("/error")
    public ResponseEntity<String> errorNotFound(){
        return ResponseEntity.internalServerError()
                .body(new GlobalExceptionHandler()
                        .handleResourceNotFound(new ResourceNotFoundException())).getBody();
    }


    @GetMapping("/errors")
    public ResponseEntity<String> errorGenericException(){
        return ResponseEntity.badRequest()
                .body(new GlobalExceptionHandler()
                        .handleGenericException(new Exception())).getBody();
    }


    @GetMapping("/greeting")
    public String greeting(){
        return "Hello from Spring Boot";
    }


    @GetMapping("/greetings")
    public String getAllGreetings(){
        StringBuilder stringBuilder = new StringBuilder("Hello, from Controller\n\n");
        stringBuilder.append("Here are all the posted greetings\n");
        for( String key: mappedString.keySet() ){
            stringBuilder.append(String.format("Posted time: %s, Greeting Body: %s\n", key, mappedString.get(key)));
        }
        return stringBuilder.toString();
    }

    @GetMapping("/allGreetings")
    public List<String> allGreetings(){
        return postedGreetings;
    }





}
