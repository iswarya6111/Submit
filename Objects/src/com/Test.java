package com;

class Bmw  
{ 
    public int mileage; 
    public int speed; 
    public Bmw(int mileage, int speed) 
    { 
        this.mileage = mileage; 
        this.speed = speed; 
    } 
    public void Bmwrange(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("Bmw car can give " +mileage + "\n" + "speed of car is " + speed); 
    }  
} 
class Jeep extends Bmw 
{ 
    public int seatHeight; 
    public Jeep(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
}
public class Test
{ 
    public static void main(String args[])  
    { 
       Jeep mb = new Jeep(25, 200, 25); 
        System.out.println(mb.toString());
    } 
}
