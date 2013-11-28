package project.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import project.models.Connection;

/**
 * @author Khalil Fazal
 */
@Path("connection")
public class ConnectionService {

    /**
     * Connection.
     *
     * @return the connection
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Connection connection() {
        return new Connection(true);
    }
}
