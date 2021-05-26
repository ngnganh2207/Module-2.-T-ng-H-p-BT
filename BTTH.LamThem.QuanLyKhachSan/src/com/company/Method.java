package com.company;

import com.sun.deploy.panel.JreTableModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    List<Room> rooms= new ArrayList<>();
    public void add(Room room){
        rooms.add(room);
    }
    public void showAll(){
        for (Room room: rooms) {
            System.out.println(room);
        }
    }
    public void deleteRoom(String identity){
        for (Room room:rooms) {
            if(identity.equals(room.getCustomer().getIdentity())){
                rooms.remove(room);
            }
        }
    }
    public void deleteCustomer(String identity){
        for (Room room: rooms) {
            if(identity.equals(room.getCustomer().getIdentity())){
                rooms.remove(room.getCustomer());
            }
        }
    }
    public void getPrice(String identity ){
        for (Room room: rooms) {
            int price;
            if(identity.equals(room.getCustomer().getIdentity())){
                 price= room.getPrice()*room.getDay();
                System.out.println(price);
            }
        }
    }
    public Person getPerson(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scanner.nextLine();
        System.out.println("Enter date: ");
        String date= scanner.nextLine();
        System.out.println(" Enter identity: ");
        String identity= scanner.nextLine();
        return new Person(name,date,identity);
    }
    public Room getRoom(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type: ");
        String type= scanner.nextLine();
        System.out.println("Enter price: ");
        int price= Integer.parseInt(scanner.nextLine());
        return new Room(day,type,price, getPerson());
    }
}
