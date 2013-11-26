package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Khalil Fazal
 */
@XmlRootElement
@XmlType(propOrder = {
    "on"
})
public class Connection {
    private final boolean on;

    public Connection(final boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return this.on;
    }
}
