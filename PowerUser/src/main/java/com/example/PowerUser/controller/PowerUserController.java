package com.example.PowerUser.controller;

import com.example.PowerUser.exception.UserException;
import com.example.PowerUser.model.PowerUser;
import com.example.PowerUser.repository.PowerUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/power/users/v1")
public class PowerUserController {

//    private final String url = "http://localhost:8080/power/users/v1";
//    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("version", 1);

    @Autowired
    private PowerUserRepository userRepository;

    @PostMapping( "/user" )
    public ResponseEntity<PowerUser> addUser(@RequestBody PowerUser powerUser){
        userRepository.save(powerUser);
        return ResponseEntity.ok(powerUser);
    }

    @GetMapping("/user")
    public List<PowerUser> getAllPowerUsers(){
        return userRepository.findAll();
    }
/*
    @GetMapping("/error")
    public ResponseEntity<String> error(HttpStatus httpStatus){

        if(HttpStatus.NOT_FOUND.is3xxRedirection()){
            return ResponseEntity.badRequest().body(new GlobalExceptions()
                            .handleResourceNotFound(new ResourceNotFoundException()))
                    .getBody();
        }
        if(HttpStatus.INTERNAL_SERVER_ERROR.is4xxClientError()){
            return ResponseEntity.badRequest().body(new GlobalExceptions()
                            .handleExceptions(new Exception()))
                    .getBody();
        }
        return ResponseEntity.internalServerError().body(new GlobalExceptions()
                        .handleResourceNotFound(new ResourceNotFoundException()))
                .getBody();

    }

    @GetMapping("/errors")
    public ResponseEntity<String> notFoundHandler(){
        return ResponseEntity.badRequest().body(new GlobalExceptions()
                        .handleResourceNotFound(new ResourceNotFoundException()))
                .getBody();
    }
*/
    @GetMapping("/user/{id}")
    @ResponseBody
    public ResponseEntity<PowerUser> getPowerUser(@PathVariable Integer id){
        PowerUser user = userRepository.findById(id).orElseThrow(() -> new UserException("User not found"));
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user-mail/{email}")
    @ResponseBody
    public ResponseEntity<PowerUser> getPowerUserByEmail(@PathVariable String email){
        PowerUser user = userRepository.findByEmail(email).orElseThrow(() -> new UserException("User not found"));
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user-name/{fullName}")
    @ResponseBody
    public ResponseEntity<PowerUser> getPowerUserByFullName(@PathVariable String fullName){
        PowerUser user = userRepository.findByFullName(fullName).orElseThrow(() -> new UserException("User not found"));
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<String> updatePowerUser( @PathVariable Integer id, @RequestBody PowerUser powerUser ){
        PowerUser user = userRepository.findById(id).orElseThrow(() -> new UserException("User not found"));

        user.setFullName(powerUser.getFullName());
        user.setAddress(powerUser.getAddress());
        user.setAge(powerUser.getAge());
        user.setEmail(powerUser.getEmail());

        userRepository.save(user);

        return ResponseEntity.ok("User successfully updated");

    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deletePowerUser(@PathVariable Integer id){
        userRepository.deleteById(id);
        return ResponseEntity.ok("User successfully deleted");
    }
}
