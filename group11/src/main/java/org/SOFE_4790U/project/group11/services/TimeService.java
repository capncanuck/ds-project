package org.SOFE_4790U.project.group11.services;

import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.SOFE_4790U.project.group11.models.Time;

/**
 * Get the current time
 * 
 * @author Khalil Fazal
 */
@Path("time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    /**
     * @return the time at the default time zone.
     */
    @GET
    public Time defaultZone() {
        return new Time();
    }

    /**
     * @param timezone the specified time zone
     * @return the current time at a time zone
     */
    @GET
    @Path("/{timezone}")
    public Time timezone(@PathParam("timezone") final String timezone) {
        return new Time(TimeZone.getTimeZone(timezone.toUpperCase()));
    }
}