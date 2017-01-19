/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_01;

/**
 *
 * @author primaananda
 */
public class Rekursif {
    
    public int faktorial(int n) {
        if (n == 0) {
           return 1; 
        }else if (n >= 1){
           return (n = n * faktorial(n-1));
        }else {
            return 0;
        }
    }
    
    public void cetakFaktorial(int n){
        if (faktorial(n) == 0) {
            System.out.println("angka tidak boleh negatif");
        }else{
            System.out.print("Nilai Faktorial dari " + n + "! ==> ");
            for (int i = n; i >= 1; i--) {
                if (i != 1) {
                    System.out.print(i + "x");
                }else{
                    System.out.print(i + " = ");
                }
            }
            System.out.println(faktorial(n));
        }
    }
    
    public int pangkat(int a, int b){
        if (b == 0) {
           return 1; 
        }else if (b >= 0){
            return (a * pangkat(a,b-1));
        }else{
            return 0;
        }
    }
    
    public void cetakPangkat(int a, int b){
        if(pangkat(a,b) == 0){
            System.out.println("Angka tidak boleh negatif");
        }else{
            System.out.print(a + " pangkat " + b + " adalah ==> ");
            for (int i = 0; i < b; i++) {
                if(i == b-1){
                    System.out.print(a + " =");
                }else{
                    System.out.print(a +"x");
                }
            }
            System.out.println(pangkat(a,b));
        }
    }
    
    public void desimalToBiner(int n){
        if(n>1){
            desimalToBiner(n/2);
        }
        System.out.print(n % 2);
    }
    
    public void desimalToHeksadesimal(int n){
        if (n>1) {
            desimalToHeksadesimal(n/16);
        }
        if ((n % 16) == 11) {
            System.out.print("a");
        }else if ((n % 16) == 12) {
            System.out.print("b");
        }else if ((n % 16) == 13) {
            System.out.print("c");
        }else if ((n % 16) == 14) {
            System.out.print("d");
        }else if ((n % 16) == 15) {
            System.out.print("e");
        }else if ((n % 16) == 16) {
            System.out.print("f");
        }else{
            System.out.print(n % 16);
        }
    }
    
    char[] daftarBiner = {'0','1'};
    public void desimalToBiner2(int n){
        if (n>1) {
            desimalToBiner2(n/2);
        }
        System.out.print(daftarBiner[n%2]);
    }
    
    char[] daftarHeksadesimal = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    public void desimalToHeksadesimal2(int n) {
        if (n>1) {
            desimalToHeksadesimal2(n/16);
        }
        System.out.print(daftarHeksadesimal[n%16]);
    }
    
    public void cetakNilai(double a, double b, double c, double d){
        System.out.println("Nilai 1 : "+a);
        System.out.println("Nilai 2 : "+b);
        System.out.println("Nilai 3 : "+c);
        System.out.println("Nilai 4 : "+d);
        double e;
        e = ((0.3*a)+(0.3*b)+(0.3*c)+(0.1*d));
        System.out.print(e);
    }
}
