package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class servo extends OpMode {

    Servo servo;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "enchilada");
    }

    @Override
    public void loop() {
        servo.setPosition(0.2);
    }
}
