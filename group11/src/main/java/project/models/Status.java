package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Status.
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
    "direction", "ignition"
})
public class Status {

    /**
     * The Enum Direction.
     *
     * @author Khalil Fazal
     * @studentNumber 100425046
     * @author Sarim Mahmood
     * @studentNumber 100372299
     * @author Rayhaan Shakeel
     * @studentNumber 100425726
     */
    private enum Direction {

        /**
         * The forwards.
         */
        FORWARDS,

        /**
         * The backwards.
         */
        BACKWARDS
    }

    /**
     * The direction.
     */
    private final Direction direction;

    /**
     * The ignition.
     */
    private final boolean ignition;

    /**
     * Instantiates a new status.
     *
     * @param forwards the forwards
     * @param ignition the ignition
     */
    public Status(final boolean forwards, final boolean ignition) {
        this.direction = forwards ? Direction.FORWARDS : Direction.BACKWARDS;
        this.ignition = ignition;
    }

    /**
     * Gets the direction.
     *
     * @return the direction
     */
    public String getDirection() {
        return this.direction.name();
    }

    /**
     * Gets the ignition.
     *
     * @return the ignition
     */
    public boolean getIgnition() {
        return this.ignition;
    }
}
