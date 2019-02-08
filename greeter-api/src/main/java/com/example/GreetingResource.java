package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/{name}")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        Greeter greeter = new Greeter();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return greeter.sayHello(name, null);
    }
}
