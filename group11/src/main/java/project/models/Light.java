package project.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Khalil Fazal
 */
@XmlRootElement
@XmlType(propOrder = {
    "lightsensor"
})
public class Light {
    private final int lightsensor;

    public Light(final int lightsensor) {
        this.lightsensor = lightsensor;
    }

    /**
     * @return the lightsensor
     */
    public int getLightsensor() {
        return lightsensor;
    }
}
