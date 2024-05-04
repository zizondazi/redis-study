package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

public class Operator2 {

    // sync
    public Flux<Integer> fluxConcatMap() {
        return Flux.range(1, 10)
                .concatMap(i -> Flux.range(i*10, 10)
                    .delayElements(Duration.ofMillis(100)))
                .log();
    }

    public Flux<Integer> monoFlatMapMany() {
        return Mono.just(10)
                .flatMapMany(i -> Flux.range(1, i))
                .log();
    }

    public Mono<Integer> defaultIfEmpty(){
        return Mono.just(100)
                .filter(i -> i > 100)
                .defaultIfEmpty(30);
    }

    public Mono<Integer> switchIfEmpty(){
        return Mono.just(100)
                .filter(i -> i > 100)
                .switchIfEmpty(Mono.just(30).map(i -> i * 2));
    }

    public Flux<String> fluxMerge() {
        return Flux.merge(Flux.fromIterable(List.of("1","2","3")), Flux.just("4"))
                .log();
    }

    public Flux<String> monoMerge() {
        return Mono.just("1").mergeWith(Mono.just("2"));
    }

    public Flux<String> fluxZip() {
        return Flux.zip(Flux.just("a","b"), Flux.just("d", "e"))
                .map(i -> i.getT1() + i.getT2())
                .log();
    }
}
