package com.intf;

public class JavaCar extends Accerator implements Breakable,Audiable {
//    @Override
//    public void accerate() {
//        super.accerate();
//    }

    @Override
    public void brake() {
        System.out.println(" Brake!! ");
    }
    public void audio(){
        System.out.println("Audio is on");
    }

    public static void main(String[] args) {
        JavaCar car= new JavaCar();


        car.accerate();
        car.brake();
        car.audio();
    }
}
