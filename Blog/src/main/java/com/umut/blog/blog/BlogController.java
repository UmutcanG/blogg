package com.umut.blog.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("blog")
public class BlogController {
    private final BlogService blogService;

    @PostMapping("/post")
    public void createPost(@RequestBody Blog blog) {
        blogService.createPost(blog);
    }

    @GetMapping("/welcome")
    public String hello() {
        return "Welcome bruh. Thats not secure bruh";
    }
    @GetMapping("/something")
    public String something() {
        return "something";
    }
    @GetMapping("/secure")
    public String secure() {
        return "secure";
    }
    @GetMapping("/foradmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String admin(){
        return "this admin site";
    }
    @GetMapping("foruser")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String user(){
        return "this is user site";
    }
}
