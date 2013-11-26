package project.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import middleware.NXTMiddleware;

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
	 * Move the NXT robot forwards
	 */
	@GET
	@Path("/forward")
	public void forward() {
		this.middleware.forward(MOTOR);
	}

	/**
	 * Stop the NXT Motor
	 */
	@GET
	@Path("/stop")
	public void stop() {
		this.middleware.stop(MOTOR);
	}

	/**
	 * Stop the NXT Motor
	 */
	@POST
	@Path("/postforward")
	public void postforward() {
		this.middleware.forward(MOTOR);
	}
}