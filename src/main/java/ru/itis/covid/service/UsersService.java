package ru.itis.covid.service;

import reactor.core.publisher.Flux;
import ru.itis.covid.entries.InfoUsers;

public interface UsersService {
    Flux<InfoUsers> getAll();
}
