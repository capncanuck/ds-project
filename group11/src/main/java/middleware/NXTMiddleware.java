package middleware;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.remote.RemoteMotor;
import lejos.pc.comm.NXTCommFactory;

/**
 * Used to communicate with an nxt device.
 *
 * @author Khalil Fazal
 * @studentNumber 100425046
 * @author Sarim Mahmood
 * @studentNumber 100372299
 * @author Rayhaan Shakeel
 * @studentNumber 100425726
 */
public class NXTMiddleware {

    /**
     * The Constant motor.
     */
    private static final RemoteMotor motor;

    /**
     * The Constant lightSensor.
     */
    private static final SensorPort lightSensor;

    /**
     * The motor's current direction.
     */
    private static boolean forward;

    static {
        motor = Motor.A;
        lightSensor = SensorPort.S1;
        forward = true;
    }

    /**
     * The lightSensor.
     */
    private LightSensor ls;

    /**
     * Start the light sensor.
     */
    private void startLightSensor() {
        if (this.ls == null) {
            this.ls = new LightSensor(lightSensor);
        }
    }

    /**
     * Gets the light value.
     *
     * @return the light value detected by the light sensor
     */
    public int getLightValue() {
        this.startLightSensor();

        return this.ls.getLightValue();
    }

    /**
     * Turn the light sensor off.
     */
    public void turnOffFloodlight() {
        this.startLightSensor();

        this.ls.setFloodlight(false);
    }

    /**
     * Turn the light sensor off.
     */
    public void turnOnFloodlight() {
        this.startLightSensor();

        this.ls.setFloodlight(true);
    }

    /**
     * Forwards.
     */
    public void forwards() {
        NXTMiddleware.forward = true;
    }

    /**
     * Backwards.
     */
    public void backwards() {
        NXTMiddleware.forward = false;
    }

    /**
     * Start.
     */
    public void start() {
        if (NXTMiddleware.forward) {
            motor.forward();
        } else {
            motor.backward();
        }
    }

    /**
     * Stop.
     */
    public void stop() {
        motor.stop();
    }

    /**
     * Checks if is forwards.
     *
     * @return true, if is forwards
     */
    public boolean isForwards() {
        return NXTMiddleware.forward;
    }

    /**
     * Checks if is moving.
     *
     * @return true, if is moving
     */
    public boolean isMoving() {
        return motor.isMoving();
    }

    /**
     * Checks if is connected.
     *
     * @return true, if is connected
     */
    public boolean isConnected() {
        try {
            NXTCommFactory.createNXTComm(NXTCommFactory.USB);
            return true;
        } catch (final Exception e) {
            return false;
        }
    }
}
