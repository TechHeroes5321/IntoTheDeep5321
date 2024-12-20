package org.firstinspires.ftc.teamcode.TEST;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
@Disabled
public class HelloWorld extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {
// this sends to the driver station
        telemetry.addData("Hello","World");
    }

    /**
     * This is called repeatedly while OpMode is playing
     */
    @Override
    public void loop() {
// intentionally left blank
    }
}
