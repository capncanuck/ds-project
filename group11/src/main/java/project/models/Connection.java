package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Connection.
 *
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
@XmlRootElement
@XmlType(propOrder = {
    "on"
})
public class Connection {

    /**
     * The on.
     */
    private final boolean on;

    /**
     * Instantiates a new connection.
     *
     * @param on the on
     */
    public Connection(final boolean on) {
        this.on = on;
    }

    /**
     * Gets the on.
     *
     * @return the on
     */
    public boolean getOn() {
        return this.on;
    }
}
