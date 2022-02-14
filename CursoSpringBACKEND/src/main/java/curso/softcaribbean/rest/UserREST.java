package curso.softcaribbean.rest;

import curso.softcaribbean.model.Countries;
import curso.softcaribbean.model.User;
import curso.softcaribbean.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(path = "/User/")
public class UserREST {

    @Autowired
    private UserService userService;

    @PostMapping
    private ResponseEntity<User> saveUser (@RequestBody User user){
        try{
            User userGuardar = userService.save(user);
            return ResponseEntity.created(new URI("/User/"+userGuardar.getUser())).body(userGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
