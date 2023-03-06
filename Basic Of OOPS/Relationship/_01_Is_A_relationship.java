/****************************
 * Is-A relationship*********************
 * Is-A relationship: Whenever one class inherits another class,
 * it is called an IS-A relationship
 * 
 * IS-A Relationship is wholly related to Inheritance. For example –
 * a kiwi is a fruit; a bulb is a device.
 * 
 * IS-A relationship can simply be achieved by using extends Keyword.
 * 
 * IS-A relationship is additionally used for code reusability in Java and to
 * avoid code
 * redundancy.
 * 
 * IS-A relationship is unidirectional, which means we can say that a bulb is a
 * device,
 * but vice versa; a device is a bulb is not possible since all the devices are
 * not bulbs.
 * 
 * IS-A relationship is tightly coupled, which means changing one entity will
 * affect another
 * entity
 * 
 * Advantage of IS-A relationship :
 * 
 * Code Reusability.
 * Reduce redundancy.
 * 
 */

// // eg. bulb is a device
// class Device { // Parent Class Device
// private String devicename;

// public void setDeviceName(String devicename) {
// this.devicename = devicename;
// }

// public String getDeviceName() {
// return this.devicename + " is a device.";
// }

// }

// public class _01_Is_A_relationship extends Device { // Child Class Bulb as
// _01_Is_A_relationship
// public static void main(String arr[]) {
// Device device = new _01_Is_A_relationship();

// // set the device name to bulb
// System.out.println("Device name is Bulb");
// device.setDeviceName("Bulb");

// // print the device name
// System.out.println(device.getDeviceName());
// }
// }

/*
 * eg. 2
 * 
 * 
 */