package project.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import lejos.pc.comm.NXTCommException;
import middleware.NXTMiddleware;
import project.models.Connection;
import project.models.Light;
import project.models.Status;

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
    @GET
    @Path("/lightSensor")
    @Produces(MediaType.APPLICATION_JSON)
    public Light lightSensor() {
        return new Light(this.middleware.getLightValue());
    }
    
    /**
     * Turn off the floodlight
     */
    @POST
    @Path("/floodlightOn")
    public void turnOffFloodlight() {
    	this.middleware.turnOffFloodlight();
    }
    
    /**
     * Turn on the floodlight
     */
    @POST
    @Path("/floodlightOff")
    public void turnOnFloodlight() {
    	this.middleware.turnOnFloodlight();
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
    public void start() {
        this.middleware.start();
    }

    /**
     * Stop the NXT Motor
     */
    @POST
    @Path("/stop")
    public void stop() {
        this.middleware.stop();
    }

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)
    public Status status() {
        return new Status(this.middleware.isForwards(), this.middleware.isMoving());
    }

    @GET
    @Path("/connection")
    @Produces(MediaType.APPLICATION_JSON)
    public Connection connection() {
        return new Connection(this.middleware.isConnected());
    }
}
