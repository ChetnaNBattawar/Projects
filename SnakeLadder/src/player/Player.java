package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactNo;
    String emailId;
    String address;
    int age;

    public void setPlayerDetails(String name, String contactNo, String emailId, String address, int age) {
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
        this.address = address;
        this.emailId = emailId;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public void getPlayerDetails() {
        System.out.println("Player details : ");
        System.out.print("Name : " + this.name);
        System.out.print("Age : " + this.age);
        System.out.print("Contact No. : " + this.contactNo);
        System.out.print("EmailId : " + this.emailId);
        System.out.print("Address : " + this.address);
    }

    public String getPlayerName() {
        return this.name;
    }

    public void setPlayerDetailsFromUserInput(Player p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player details : ");
        System.out.println("Name : ");
        String name = sc.nextLine();
        System.out.println("Contact No. : ");
        String contactNo = sc.nextLine();
        System.out.println("Address : ");
        String address = sc.nextLine();
        System.out.println("EmailId : ");
        String emailId = sc.nextLine();
        System.out.println("Age : ");
        int age = sc.nextInt();

        p.setPlayerDetails(name, contactNo, emailId, address, age);
        // sc.close(); because while taking the another input the scanner class gets
        // closed thus the exception of nosuchelement got
    }
}
