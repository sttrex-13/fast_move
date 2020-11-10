package data;

import base.*;
import fastmove.ParcelStack;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("p1",1);
        bikes[1] = new Bike("p2",2);
        bikes[2] = new Bike("p3",3);

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person("st.","vpt");
        person[1] = new Person("joo","joh");
        person[2] = new Person("time","mie");

        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(3,ParcelStatus.DELIVERED,new Location(2,3));
        parcels[1] = new Parcel(14.5,ParcelStatus.SHIPPING,new Location(21,32));
        parcels[2] = new Parcel(13.22,ParcelStatus.SHIPPING,new Location(39,333));
        parcels[3] = new Parcel(45.6,ParcelStatus.DELIVERED,new Location(6,13));
        parcels[4] = new Parcel(12.3,ParcelStatus.DELIVERED,new Location(3,3));
        parcels[5] = new Parcel(3.9,ParcelStatus.READY_TO_SHIP,new Location(3,1));
        parcels[6] = new Parcel(9.4,ParcelStatus.READY_TO_SHIP,new Location(8,4));
        parcels[7] = new Parcel(50.1,ParcelStatus.DELIVERED,new Location(7,7));
        parcels[8] = new Parcel(64.1,ParcelStatus.SHIPPING,new Location(5,6));
        parcels[9] = new Parcel(35,ParcelStatus.DELIVERED,new Location(4,3));

        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
