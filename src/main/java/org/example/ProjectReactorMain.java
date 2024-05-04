package org.example;

public class ProjectReactorMain {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        publisher.startFlux()
                .subscribe(i -> System.out.println(i));

//        publisher.startMono()
//                .subscribe();
    }
}
