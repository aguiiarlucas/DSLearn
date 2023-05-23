package com.devsuperior.dslearn.resources;

import com.devsuperior.dslearn.dto.UserDTO;
import com.devsuperior.dslearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {



    @Autowired
    private UserService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO>findById(@PathVariable Long id){

        UserDTO userDTO = service.findById(id);
        return ResponseEntity.ok().body(userDTO);
    }
}
