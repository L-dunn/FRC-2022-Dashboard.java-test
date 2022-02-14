package frc.robot;

import java.beans.Encoder;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Dashboard {


    public Dashboard() {
        display();
    }

    public void display() {
        intakeInfo();
        feederInfo();
        climberInfo();
        shooterInfo();
        visionInfo();
    }

    public void intakeInfo() {
        SmartDashboard.putBoolean("String", true); //Example
    }

    public void feederInfo() {
        SmartDashboard.putBoolean("String", true);
        //Encoder
        Encoder feederMotorEncoder = new Encoder (10);
        feederMotorEncoder.getDistance();
        //Voltage
        SmartDashboard.putNumber("Voltage", feeder.getAverageVoltage());
    }


    public void climberInfo() {
        SmartDashboard.putBoolean("String", true);
        //Get encoder values 
    }

    public void shooterInfo() {
        SmartDashboard.putBoolean("String", true);
    }

    public void visionInfo() {
        SmartDashboard.putBoolean("String", true);
    }



}
