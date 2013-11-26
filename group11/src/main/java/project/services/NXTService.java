package project.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import middleware.NXTMiddleware;
import project.models.Time;

/**
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
@Path("nxt")
@Produces(MediaType.APPLICATION_JSON)
public class NXTService {

	/**
	 * The motor that will be controlled
	 */
	private static final char MOTOR = 'A';

	/**
	 * the middleware to the NXT
	 */
	private final NXTMiddleware middleware;

	/**
	 * Create a connection to the middleware
	 */
	public NXTService() {
		this.middleware = new NXTMiddleware();
	}

	/**
	 * Move the NXT robot motor forwards
	 */
	@POST
	@Path("/forward")

	public void forward() {
		this.middleware.forward(MOTOR);
	}

	/**
	 * Move the NXT robot motor backwards
	 */
	@POST
	@Path("/backward")
	public void backward() {
		this.middleware.backward(MOTOR);
	}
	
	/**
	 * Stop the NXT Motor
	 */
	@POST
	@Path("/stop")
	public void stop() {
		this.middleware.stop(MOTOR);
	}
}
