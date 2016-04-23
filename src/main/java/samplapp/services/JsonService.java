package samplapp.services;

import samplapp.Track;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by bobyk on 23/04/16.
 */
@Path("/json/metallica")
public class JsonService {

    static Track track1 = null;

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");

        if (track1 == null) return track;
        else return track1;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        String result = "Track saved : " + track;
        track1 = track;
        return Response.status(201).entity(result).build();

    }

}