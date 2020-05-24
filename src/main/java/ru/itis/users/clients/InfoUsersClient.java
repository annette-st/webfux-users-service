package ru.itis.users.clients;

import reactor.core.publisher.Flux;
import ru.itis.users.entries.InfoUsers;

public interface InfoUsersClient {
    //Flux<CovidStatistic> getAll();
    Flux<InfoUsers> getAll();
}
