package io.pragra.learning.resttemplatedemo.rest;

import io.pragra.learning.resttemplatedemo.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
public class GitUserController {
    private final RestTemplate template;

    @GetMapping("/api/user/{userId}")
    public ResponseEntity<User> getUserFromGitHub(@PathVariable("userId") String userId){
        return template.exchange("https://api.github.com/users/{userId}" , HttpMethod.GET, null, User.class, Collections.singletonMap("userId",userId));
    }

}
