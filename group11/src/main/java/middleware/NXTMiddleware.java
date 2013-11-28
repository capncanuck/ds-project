package middleware;

import lejos.nxt.ColorSensor.Color;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.remote.RemoteMotor;
import lejos.pc.comm.NXTCommFactory;

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

    private static boolean forward = true;

    /**
     * @return the light value detected by the light sensor
     */
    public int getLightValue() {
        return new LightSensor(SensorPort.S1).getLightValue();
    }
    
    /**
     * Turn the light sensor off
     */
    public void turnOffFloodlight() {
    	LightSensor ls = new LightSensor(SensorPort.S1);
    	ls.setFloodlight(false);
    }

    /**
     * Turn the light sensor off
     */
    public void turnOnFloodlight() {
    	LightSensor ls = new LightSensor(SensorPort.S1);
    	ls.setFloodlight(true);
    }
    
    /**
     * 
     */
    public void forwards() {
        NXTMiddleware.forward = true;
    }

    /**
     * 
     */
    public void backwards() {
        NXTMiddleware.forward = false;
    }

    /**
     * 
     */
    public void start() {
        if (NXTMiddleware.forward) {
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
        return NXTMiddleware.forward;
    }

    /**
     * @return
     */
    public boolean isMoving() {
        return motor.isMoving();
    }

    /**
     * @return
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
