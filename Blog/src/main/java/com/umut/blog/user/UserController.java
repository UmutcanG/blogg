package com.umut.blog.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return "deleted";
    }
}
