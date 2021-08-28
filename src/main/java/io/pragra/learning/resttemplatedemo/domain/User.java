package io.pragra.learning.resttemplatedemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private String login;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    private String name;
    private String location;
}
