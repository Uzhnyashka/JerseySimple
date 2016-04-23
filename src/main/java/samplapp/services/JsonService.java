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

    static String title = "Enter Sandman", singer = "Metallica";

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle(title);
        track.setSinger(singer);

        return track;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        title = track.getTitle();
        singer = track.getSinger();

        String result = "Track saved : " + track;

        return Response.status(201).entity(result).build();

    }

}