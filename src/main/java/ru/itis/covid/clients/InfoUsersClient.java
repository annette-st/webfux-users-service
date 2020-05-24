package ru.itis.covid.clients;

import reactor.core.publisher.Flux;
import ru.itis.covid.entries.InfoUsers;

public interface InfoUsersClient {
    //Flux<CovidStatistic> getAll();
    Flux<InfoUsers> getAll();
}
