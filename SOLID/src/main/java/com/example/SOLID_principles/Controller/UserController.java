package com.example.SOLID_principles.Controller;

import com.example.SOLID_principles.Model.User;
import com.example.SOLID_principles.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private UserService userService;//principio de Inversión de Dependencias (IoD)

    //Create a new user
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

    //Get a user
    @GetMapping("/{id}")
    public ResponseEntity<?> readOne(@PathVariable(value = "id") Long id) {
        Optional<User> oUser = userService.findById(id);
        //si no se encuentra el usuario(el id) se retorna un not found
        if (!oUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }//de locontrario se retorna el usuario
        return ResponseEntity.ok(oUser);
    }

    //Update an user
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User userDetails, @PathVariable(value = "id") Long id) {
        Optional<User> user = userService.findById(id);
        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        //BeanUtils.copyProperties(userDetails, user.get());
        user.get().setName(userDetails.getName());
        user.get().setEmail(userDetails.getEmail());
        user.get().setPassword(userDetails.getPassword());
        user.get().setPhone(userDetails.getPhone());
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));
    }

    //Delete a user
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        if (!userService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //Get all users
    @GetMapping
    public List<User> readAll() {
        List<User> users = StreamSupport//<--hereda de Object y me trae los stream
                .stream(userService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return users;
    }
}
