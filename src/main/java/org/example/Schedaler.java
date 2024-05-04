package org.example;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Schedaler {
    public Flux<Integer> fluxMapWithSubscribeOn() {
        return Flux.range(1, 10)
                .map(i -> i * 2)
                .subscribeOn(Schedulers.boundedElastic())
                .log();
    }
}
