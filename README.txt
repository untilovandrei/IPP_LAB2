*** Factory method ***

There are 2 basic entities:
1. Laptop.java
2. PC.java

Each of these classes implements the interface Device.java.

The class DeviceFactory.java produces instances of Device.java (Laptop or PC), 
depending on the input parameter of "getDevice" method.

