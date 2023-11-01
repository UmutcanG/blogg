package com.umut.blog.blog;

import com.umut.blog.user.User;
import com.umut.blog.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;
    private final UserService userService;

    public void createPost(Blog blog) {

    }
}
