package com.example;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import reactor.core.publisher.Mono;

@Controller("/hello")
public class HelloController {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public HttpResponse<Mono<String>> index() {
        return HttpResponse.ok(Mono.error(new RuntimeException())); 
    }

}