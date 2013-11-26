package middleware;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.pc.comm.NXTCommException;
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
     * the NXT robot's light sensor
     */
    private LightSensor lightSensor;

    /**
     * Provides an interface to send commands to the NXT Robot
     */
    public NXTMiddleware() {
        super();

        try {
            NXTCommFactory.createNXTComm(NXTCommFactory.USB);
            this.lightSensor = new LightSensor(SensorPort.S1);
        } catch (final NXTCommException e) {
            System.out.println("Error - creating NXT connection");
        }
    }

    /**
     * Move the NXT robot's motor forward
     * 
     * @param motorLabel the motor's label ['A' .. 'd']
     */
    public void forward(final char motorLabel) {
        switch (motorLabel) {
            case 'A':
                Motor.A.forward();
                break;
            case 'B':
                Motor.B.forward();
                break;
            case 'C':
                Motor.C.forward();
                break;
            default:
        }
    }

    /**
     * Move the NXT robot's motor backwards
     * 
     * @param motorLabel the motor's label ['A' .. 'd']
     */
    public void backward(final char motorLabel) {
        switch (motorLabel) {
            case 'A':
                Motor.A.backward();
                break;
            case 'B':
                Motor.B.backward();
                break;
            case 'C':
                Motor.C.backward();
                break;
            default:
        }
    }

    /**
     * Stop the NXT robot's motor
     * 
     * @param motorLabel the motor's label ['A' .. 'd']
     */
    public void stop(final char motorLabel) {
        switch (motorLabel) {
            case 'A':
                Motor.A.stop();
                break;
            case 'B':
                Motor.B.stop();
                break;
            case 'C':
                Motor.C.stop();
                break;
            default:
        }
    }

    /**
     * @return the light value detected by the light sensor
     */
    public int getLightValue() {
        return this.lightSensor.getLightValue();
    }
}
