package com.umut.blog.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User Created";

    }

    public void deleteUser(String id) {
        User user = userRepository.findById(Integer.valueOf(id)).orElseThrow(()-> new RuntimeException("not found"));
        userRepository.delete(user);
    }
}
