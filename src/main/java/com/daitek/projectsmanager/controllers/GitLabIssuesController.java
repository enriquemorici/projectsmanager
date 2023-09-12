package com.daitek.projectsmanager.controllers;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.KeyManagementException;
import java.util.List;

@RestController
@RequestMapping("/gitlab")
@Log4j2
public class GitLabIssuesController {

    @CrossOrigin(origins = "*")
    @GetMapping("/message")
    public String reciveGitLabEvent() {
        return "Hola";
    }
}
