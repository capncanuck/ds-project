package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Light.
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
    "lightsensor"
})
public class Light {

    /**
     * The lightsensor.
     */
    private final int lightsensor;

    /**
     * Instantiates a new light.
     *
     * @param lightsensor the lightsensor
     */
    public Light(final int lightsensor) {
        this.lightsensor = lightsensor;
    }

    /**
     * Gets the lightsensor.
     *
     * @return the lightsensor
     */
    public int getLightsensor() {
        return this.lightsensor;
    }
}
