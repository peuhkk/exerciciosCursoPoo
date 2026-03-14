package school.application;

import school.entities.entities03;

import java.util.Locale;
import java.util.Scanner;

public class application03 {
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        entities03 system01 = new entities03();

        system01.name = sc.nextLine();
        system01.n1 = sc.nextDouble();
        system01.n2 = sc.nextDouble();
        system01.n3 = sc.nextDouble();

        System.out.println(system01);

    }
}
