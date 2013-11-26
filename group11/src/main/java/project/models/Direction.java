package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Khalil Fazal
 */
@XmlRootElement
@XmlType(propOrder = {
    "direction"
})
public class Direction {

    /**
     * @author Khalil Fazal
     */
    private enum Directions {

        /**
         * 
         */
        FORWARDS,

        /**
         * 
         */
        BACKWARDS
    }

    /**
     * 
     */
    private final Directions direction;

    /**
     * @param forwards
     */
    public Direction(final boolean forwards) {
        this.direction = forwards ? Directions.FORWARDS : Directions.BACKWARDS;
    }

    /**
     * @return
     */
    public String getDirection() {
        return this.direction.name();
    }
}
