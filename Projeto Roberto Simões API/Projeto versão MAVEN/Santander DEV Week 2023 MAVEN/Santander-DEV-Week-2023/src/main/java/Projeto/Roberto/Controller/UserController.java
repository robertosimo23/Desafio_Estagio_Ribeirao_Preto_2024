package Projeto.Roberto.Controller;

import Projeto.Roberto.Repository.UserRepository;
import Projeto.Roberto.model.User;
import Projeto.Roberto.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController<id> {

    private final UserService userService;
    private int id;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(PathVariable Long ) {
        var user = userService.findById();
        return ResponseEntity.ok(user);

    }

    @PostMapping
    public ResponseEntity<List<UserRepository>> create(@RequestBody User userToCreate) {
        var userCreated = userService.create(userToCreate);
        URI localtion = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.get(id))
                .toUri();
        return ResponseEntity.created(localtion).body(userCreated);
    }
}
