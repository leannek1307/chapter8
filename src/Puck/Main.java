package Puck;

/*
 * TestDisk.java
 * A simple application for testing the Disk class.
 * Lawrenceville Press
 * June 10, 2011
 */

 /**
  * The Disk class is tested.
  */
 public class Main {

	public static void main(String[] args) {
//		Disk saucer = new Disk(10, 0.02);

//		System.out.println("Disk radius: " + saucer.getRadius());
//		System.out.println("Disk surface area: " + saucer.area());
//		System.out.println("Disk volume: " + saucer.volume());
//
//		Disk plate1 = new Disk(12, 0.05);
//		Disk plate2 = new Disk(12, 0.07);
//		if (plate1.equals(plate2)) {
//			System.out.println("Objects are equal.");
//		} else {
//			System.out.println("Objects are not equal.");
//		}
//		System.out.println(plate1);
//		System.out.println(plate2);

                Puck puck1 = new Puck(5,5.5);
                Puck puck2 = new Puck(7,5.6);
                System.out.println(puck1);
                System.out.println(puck2);
                
                if (puck1.compareTo(puck2) == 0){
                    System.out.println("Objects are equal.");
                } else if (puck1.compareTo(puck2) < 0){
                    System.out.println("Puck1 is smaller than Puck2");
                } else {
                    System.out.println("Puck1 is larger than Puck2");
                }
	}
}