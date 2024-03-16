package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        //test
//        System.out.println("testcases 1");
//        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");
//
//        assert car.getName() == "Tata";
//        System.out.println(car.getName().equals("Tata"));
//
//        assert car.getDoors() == 4;
//        System.out.println(car.getDoors() == 4);
//
//        assert car.getGears() == 4;
//        System.out.println(car.getGears() == 4);
//
//        assert car.getWheels() == 4;
//        System.out.println(car.getWheels() == 4);
//
//        assert car.isManual();
//        System.out.println(car.isManual());
//
//        assert car.getType() == "Sedan";
//        System.out.println(car.getType().equals("Sedan"));
//
//        assert car.getCurrentGear() == 1;
//        System.out.println(car.getCurrentGear() == 1);
//
//        car.changeSpeed(20, 30);
//
//        assert car.getCurrentSpeed() == 20;
//        System.out.println(car.getCurrentSpeed() == 20);
//
//        assert car.getCurrentDirection() == 30;
//        System.out.println(car.getCurrentDirection()==30);
//
//        car.changeGear(3);
//
//        assert car.getCurrentGear() == 3;
//        System.out.println(car.getCurrentGear() == 3);
//
//
//        //testcase 2
//        System.out.println("testcases 2");
//        F1 f1 = new F1("BMW", false);
//
//        assert f1.getName() == "BMW";
//
//        assert !f1.isManual();
//
//        f1.accelerate(0);
//
//        assert f1.getCurrentSpeed() == 0;
//
//        assert f1.getCurrentGear() == 1;
//
//        f1.accelerate(50);
//
//        assert f1.getCurrentSpeed() == 50;
//
//        assert f1.getCurrentGear() == 1;
//
//        f1.accelerate(25);
//
//        assert f1.getCurrentSpeed() == 75;
//
//        assert f1.getCurrentGear() == 2;
//
//        f1.accelerate(50);
//
//        assert f1.getCurrentSpeed() == 125;
//
//        assert f1.getCurrentGear() == 3;
//
//        f1.accelerate(26);
//
//        assert f1.getCurrentSpeed() == 151;
//
//        assert f1.getCurrentGear() == 4;
//
//        f1.accelerate(99);
//
//        assert f1.getCurrentSpeed() == 250;
//
//        assert f1.getCurrentGear() == 5;
//
//        f1.accelerate(1);
//
//        assert f1.getCurrentSpeed() == 251;
//
//        assert f1.getCurrentGear() == 6;
//
//        System.out.println(f1.getCurrentDirection()==0);
    }
}