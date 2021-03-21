package kodzamani.elci.controller;

import java.util.List;

import kodzamani.elci.model.User;
import kodzamani.elci.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepo.findAll();
    }
}
