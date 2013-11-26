package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Khalil Fazal
 */
@XmlRootElement
@XmlType(propOrder = {
    "direction", "ignition"
})
public class Status {
    /**
    * @author Khalil Fazal
    */
    private enum Direction {

        /**
         * 
         */
        FORWARDS,

        /**
         * 
         */
        BACKWARDS
    }

    private final Direction direction;
    private final boolean ignition;

    /**
     * @param forwards
     */
    public Status(final boolean forwards, final boolean ignition) {
        this.direction = forwards ? Direction.FORWARDS : Direction.BACKWARDS;
        this.ignition = ignition;
    }

    /**
    * @return
    */
    public String getDirection() {
        return this.direction.name();
    }

    public boolean getIgnition() {
        return this.ignition;
    }
}
