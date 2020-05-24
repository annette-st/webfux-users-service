package ru.itis.users.service;

import reactor.core.publisher.Flux;
import ru.itis.users.entries.InfoUsers;

public interface UsersService {
    Flux<InfoUsers> getAll();
}
