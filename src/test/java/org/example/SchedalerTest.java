package org.example;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class SchedalerTest {
    private Schedaler schedaler = new Schedaler();

    @Test
    void fluxMapWithSubscribeOn() {
        StepVerifier.create(schedaler.fluxMapWithSubscribeOn())
                .expectNextCount(10)
                .verifyComplete();
    }
}