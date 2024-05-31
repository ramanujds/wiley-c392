package com.wiley.traineeapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GitHubUser(String login, String name, String location, @JsonProperty("public_repos") int publicRepos) {
}
