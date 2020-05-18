package com.java.practice.string;
interface Vehicle
{
 void start();
 void run();
}
abstract class AbstractVehicle implements Vehicle
{
 public void start()
 {
  run();
 }
}
class Car extends AbstractVehicle
{
 public void run()
 {
  System.out.println("car is running");
 }
}
class Bike extends AbstractVehicle
{
 public void run()
 {
  System.out.println("bike is running");
 }
}
class Tested

{
 public static void main(String args[])
 {
  Vehicle v;
  v=new Car();
  v.start();
  v=new Bike();
  v.start();
 }
}  