//Q2. Design a class Room that has properties AC_ON, HOME_THEATRE_ON, 
//FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF.
//Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message.
//If the total power consumed is more than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, 
//Fan consumes 400 watts and light consumes 100 watt.

import java.util.Scanner;
public class Room {
    public boolean AC_ON,HOME_THEATER_ON,FAN_ON,LIGHT_ON;
    public void InputBoolean(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter AC inputs");
        AC_ON=s.nextBoolean();
        System.out.println("Enter Home theater input");
        HOME_THEATER_ON=s.nextBoolean();
        System.out.println("Enter Fan input");
        FAN_ON=s.nextBoolean();
        System.out.println("Enter Light input");
        LIGHT_ON=s.nextBoolean();

    }
    public void Consumes(){
        int pow =  0;
        if(AC_ON==true)
            pow +=1200;
        if(HOME_THEATER_ON==true)
            pow +=600;
        if(FAN_ON == true)
            pow +=400;
        if(LIGHT_ON == true)
            pow +=100;
        if(pow >1200)
        {
            System.out.println("power overload");
        }
        else
            System.out.println("total power consumption "+pow);
    }
}
class Roommain
{
    public static void main(String[] args) {
        Room obj =new Room();
        obj.InputBoolean();
        obj.Consumes();
    }
}
