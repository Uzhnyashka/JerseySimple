package samplapp.services;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jerseyy say : " + msg;

        return Response.status(200).entity(output).build();

    }

}