package codeforce;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int weight ;
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextInt();

        if(weight > 2 && weight % 2 == 0){
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
