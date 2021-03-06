package ru.itis.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.itis.users.entries.InfoUsers;
import ru.itis.users.service.UsersService;


@RestController
@RequestMapping("/users-management")
public class InfoUsersController {

    @Autowired
    private UsersService covidService;

    @GetMapping(value = "/records", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<InfoUsers> getAll() {
        return covidService.getAll();
    }
}
