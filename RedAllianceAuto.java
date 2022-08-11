package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "RedAllianceAuto (Blocks to Java)")
public class RedAllianceAuto extends LinearOpMode {

  private DcMotor frontright;
  private DcMotor frontleft;
  private DcMotor backright;
  private DcMotor backleft;
  private DcMotor armMotor;
  private Servo armServo;
  //
  private ElapsedTime runtime = new ElapsedTime();
  
  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    // Put initialization blocks here.
    
    waitForStart();
    
        
    frontright = hardwareMap.get(DcMotor.class, "front right");
    frontleft = hardwareMap.get(DcMotor.class, "front left");
    backright = hardwareMap.get(DcMotor.class, "back right");
    backleft = hardwareMap.get(DcMotor.class, "back left");
    armMotor = hardwareMap.get(DcMotor.class, "armMotor");
    armServo = hardwareMap.get(Servo.class, "armServo");
    //
    
    frontright.setDirection(DcMotor.Direction.REVERSE);
    frontleft.setDirection(DcMotor.Direction.REVERSE);
    backright.setDirection(DcMotor.Direction.REVERSE);
    backleft.setDirection(DcMotor.Direction.REVERSE);
    //
    armMotor.setDirection(DcMotor.Direction.REVERSE);
    //
    armServo.setPosition(0);
    
    
    runtime.reset();
    
    armMotor.setPower(0.5);
    frontright.setPower(0);
    frontleft.setPower(0);
    backright.setPower(0);
    backleft.setPower(0);
    //move backward
    sleep(1000); //pauses before start
    frontright.setPower(-0.5);
    frontleft.setPower(0.5);
    backright.setPower(0.5);
    backleft.setPower(-0.5);
    
    armMotor.setPower(1);
    
    sleep(760); //time interval for going forward
    
    frontright.setPower(0);
    frontleft.setPower(0);
    backright.setPower(0);
    backleft.setPower(0);
    
    sleep(1000); //pauses for the drop
    armServo.setPosition(0.5);
    sleep(500);
    //move forward

    
    //
    frontright.setPower(0.5);
    frontleft.setPower(-0.5);
    backright.setPower(-0.5);
    backleft.setPower(0.5);
    
    sleep(1050); //time interval for going backward
    //move left
    frontright.setPower(0.5);
    frontleft.setPower(0.5);
    backright.setPower(-0.5);
    backleft.setPower(-0.5);
    
    armMotor.setPower(1);
    
    sleep(2550); //time interval for going sideways
    frontright.setPower(0);
    frontleft.setPower(0);
    backright.setPower(0);
    backleft.setPower(0);
    
       
       
      
    
  }
}
