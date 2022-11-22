import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("N Girin: ");
        int n= klavye.nextInt();

        System.out.print("R Gir: ");
        int r= klavye.nextInt();

        int fakN=1;
        int fakR=1;
        int fakC=1;

        for (int i = 1; i <=n ; i++) {
            fakN*=i;

        }
        System.out.println(n+ "!= " +fakN);


        for (int i = 1; i <=r ; i++) {
            fakR*=i;

        }
        System.out.println(r+ "!= "+fakR);


    int c=(n-r);
        for (int i = 1; i <=c; i++) {
            fakC*=i;
        }
        System.out.println("Kombinasyon: " +fakN/(fakR*fakC));
}}