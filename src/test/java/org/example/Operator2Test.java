package org.example;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class Operator2Test {
    private Operator2 op = new Operator2();

    @Test
    void fluxConcatMap() {
        StepVerifier.create(op.fluxConcatMap())
                .expectNextCount(100)
                .verifyComplete();
    }

    @Test
    void monoFlatMapMany() {
        StepVerifier.create(op.monoFlatMapMany())
                .expectNextCount(10)
                .verifyComplete();
    }

    @Test
    void defaultIfEmpty() {
        StepVerifier.create(op.defaultIfEmpty())
                .expectNext(30)
                .verifyComplete();
    }

    @Test
    void switchIfEmpty() {
        StepVerifier.create(op.switchIfEmpty())
                .expectNext(60)
                .verifyComplete();
    }

    @Test
    void fluxMerge() {
        StepVerifier.create(op.fluxMerge())
                .expectNext("1", "2", "3","4")
                .verifyComplete();
    }

    @Test
    void monoMerge() {
        StepVerifier.create(op.monoMerge())
                .expectNext("1", "2")
                .verifyComplete();
    }

    @Test
    void fluxZip() {
        StepVerifier.create(op.fluxZip())
                .expectNext("ad", "be")
                .verifyComplete();
    }
}