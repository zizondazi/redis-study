package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Publisher {

    public Flux<Integer> startFlux() {
       return Flux.range(1, 10).log();
    }

    public Mono<Integer> startMono() {
        return Mono.just(1).log();
    }

    public Mono<?> startMono2() {
        return Mono.empty().log();
    }

    public Mono<?> startMono3() {
        return Mono.error(new Exception("Mono error"));
    }
}
