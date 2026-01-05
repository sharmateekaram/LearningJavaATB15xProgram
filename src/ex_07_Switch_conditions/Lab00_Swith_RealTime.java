package ex_07_Switch_conditions;

import java.util.Scanner;

public class Lab00_Swith_RealTime {
    static void main(String[] args) {

        System.out.println("Enter the browser");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Selected Browser is - Chrome");
                break;
            case "edge":
                System.out.println("Selected Browser is - Edge");
                break;
            case "firefox":
                System.out.println("Selected Browser is - Firefox");
                break;
            default:
                System.out.println("Please select allowed broswer");
                break;
        }
    }
}
