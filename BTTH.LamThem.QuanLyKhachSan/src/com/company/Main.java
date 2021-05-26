package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Method method= new Method();
        do {
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Add Room");
        System.out.println("2.Show All Room");
        System.out.println("3. Delete Room");
        System.out.println("4. Delete Customer");
        System.out.println("5. Tính tiền");
        System.out.println("6.exit");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Room room = method.getRoom();
                method.add(room);
                break;
            case 2:
                method.showAll();
                break;
            case 3:
                System.out.println(" Enter id: ");
                String id = scanner.nextLine();
                method.deleteRoom(id);
                break;
            case 4:
                System.out.println("Enter id: ");
                String id1 = scanner.nextLine();
                method.deleteCustomer(id1);
                break;
            case 5:
                System.out.println(" Enter ID");
                String id2 = scanner.nextLine();
                method.getPrice(id2);
                break;
            case 6:
                System.exit(0);
        }
        }while (true);
    }
}
