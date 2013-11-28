package project.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lejos.pc.comm.NXTCommException;
import middleware.NXTMiddleware;
import project.models.Light;
import project.models.Status;

/**
 * The Class NXTService.
 *
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
     * the middleware to the NXT.
     */
    private final NXTMiddleware middleware;

    /**
     * Create a connection to the middleware.
     *
     * @throws NXTCommException the nXT comm exception
     */
    public NXTService() throws NXTCommException {
        this.middleware = NXTMiddleware.INSTANCE;
    }

    /**
     * Light sensor.
     *
     * @return the light
     */
    @GET
    @Path("/lightSensor")
    @Produces(MediaType.APPLICATION_JSON)
    public Light lightSensor() {
        return new Light(this.middleware.getLightValue());
    }

    /**
     * Toggle light.
     *
     * @param action the action
     */
    @POST
    @Path("/light/{action}")
    public void toggleLight(@PathParam("action") final String action) {
        if (action.equals("on")) {
            this.middleware.turnOnFloodlight();
        } else if (action.equals("off")) {
            this.middleware.turnOffFloodlight();
        }
    }

    /**
     * Move the NXT robot motor forwards.
     */
    @POST
    @Path("/forwards")
    public void forwards() {
        this.middleware.forwards();
    }

    /**
     * Move the NXT robot motor backwards.
     */
    @POST
    @Path("/backwards")
    public void backwards() {
        this.middleware.backwards();
    }

    /**
     * Start.
     */
    @POST
    @Path("/start")
    public void start() {
        this.middleware.start();
    }

    /**
     * Stop the NXT Motor.
     */
    @POST
    @Path("/stop")
    public void stop() {
        this.middleware.stop();
    }

    /**
     * Status.
     *
     * @return the status
     */
    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public Status status() {
        return new Status(this.middleware.isForwards(), this.middleware.isMoving());
    }
}
