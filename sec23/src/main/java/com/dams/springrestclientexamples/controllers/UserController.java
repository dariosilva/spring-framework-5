package com.dams.springrestclientexamples.controllers;

import com.dams.springrestclientexamples.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

import java.util.Objects;

/**
 * Created by jt on 9/22/17.
 */
@Slf4j
@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange){
        model.addAttribute("users",
                apiService.getUsers(serverWebExchange.getFormData()
                        .map(data -> Integer.valueOf(Objects.requireNonNull(data.getFirst("limit"))))));

        return "userlist";
    }
}
