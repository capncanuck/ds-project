package middleware;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.remote.RemoteMotor;

/**
 * Used to communicate with an nxt device.
 * This is a singleton class. 
 *
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
public enum NXTMiddleware {

    /**
     * The instance.
     */
    INSTANCE;

    /**
     * The motor.
     */
    private final RemoteMotor motor;

    /**
     * The lightSensor.
     */
    private LightSensor sensor;

    /**
     * The motor's current direction.
     */
    private boolean forward;

    /**
     * Instantiates a new NXT middleware.
     */
    private NXTMiddleware() {
        this.motor = Motor.A;
        this.forward = true;
    }

    private void startLightSensor() {
        if (this.sensor == null) {
            this.sensor = new LightSensor(SensorPort.S1);
        }
    }

    /**
     * Gets the light value.
     *
     * @return the light value detected by the light sensor
     */
    public int getLightValue() {
        this.startLightSensor();
        this.turnOffFloodlight();
        return this.sensor.getLightValue();
    }

    /**
     * Turn the light sensor off.
     */
    public void turnOnFloodlight() {
        this.startLightSensor();
        this.sensor.setFloodlight(true);
    }

    /**
    * Turn the light sensor off.
    */
    public void turnOffFloodlight() {
        if (this.sensor != null) {
            this.sensor.setFloodlight(false);
        }
    }

    /**
     * Forwards.
     */
    public void forwards() {
        if (this.isMoving() && !this.forward) {
            this.motor.forward();
        }

        this.forward = true;
    }

    /**
     * Backwards.
     */
    public void backwards() {
        if (this.isMoving() && this.forward) {
            this.motor.backward();
        }

        this.forward = false;
    }

    /**
     * Start.
     */
    public void start() {
        if (this.forward) {
            this.motor.forward();
        } else {
            this.motor.backward();
        }
    }

    /**
     * Stop.
     */
    public void stop() {
        this.motor.stop();
    }

    /**
     * Checks if the motor is set to forwards.
     *
     * @return true, if the motor is set to forwards
     */
    public boolean isForwards() {
        return this.forward;
    }

    /**
     * Checks if the motor is moving.
     *
     * @return true, if the motor is moving
     */
    public boolean isMoving() {
        return this.motor.isMoving();
    }
}
