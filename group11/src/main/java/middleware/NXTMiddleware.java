package middleware;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.remote.RemoteMotor;

/**
 * Used to communicate with an nxt device
 * 
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Mitch George
 * @studentNumber 100429078
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
public class NXTMiddleware {

    /**
     * 
     */
    private static final RemoteMotor motor = Motor.A;

    /**
     * 
     */
    private boolean forward;

    /**
     * 
     */
    public NXTMiddleware() {
        this.forwards();
    }

    /**
     * @return the light value detected by the light sensor
     */
    public int lightSensor() {
        return new LightSensor(SensorPort.S1).getLightValue();
    }

    /**
     * 
     */
    public void forwards() {
        this.forward = true;
    }

    /**
     * 
     */
    public void backwards() {
        this.forward = false;
    }

    /**
     * 
     */
    public void start() {
        if (this.forward) {
            motor.forward();
        } else {
            motor.backward();
        }
    }

    /**
     * 
     */
    public void stop() {
        motor.stop();
    }

    /**
     * @return
     */
    public boolean isForwards() {
        return this.forward;
    }
}
