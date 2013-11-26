package project.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lejos.pc.comm.NXTCommException;
import middleware.NXTMiddleware;
import project.models.Direction;
import project.models.Light;

/**
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
@Path("nxt")
public class NXTService {

    /**
     * the middleware to the NXT
     */
    private final NXTMiddleware middleware;

    /**
     * Create a connection to the middleware
     * @throws NXTCommException 
     */
    public NXTService() throws NXTCommException {
        this.middleware = new NXTMiddleware();
    }

    /**
     * @return
     */
    @POST
    @Path("/lightSensor")
    @Produces(MediaType.APPLICATION_JSON)
    public Light lightSensor() {
        return new Light(this.middleware.lightSensor());
    }

    /**
     * Move the NXT robot motor forwards
     */
    @POST
    @Path("/forwards")
    public void forwards() {
        this.middleware.forwards();
    }

    /**
     * Move the NXT robot motor backwards
     */
    @POST
    @Path("/backwards")
    public void backwards() {
        this.middleware.backwards();
    }

    @POST
    @Path("/start")
    @Produces(MediaType.APPLICATION_JSON)
    public Direction start() {
        this.middleware.start();
        return new Direction(this.middleware.isForwards());
    }

    /**
     * Stop the NXT Motor
     */
    @POST
    @Path("/stop")
    public void stop() {
        this.middleware.stop();
    }
}
