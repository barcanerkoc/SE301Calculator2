/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author baris
 */
public class CalculatorJavaApplication6 {
    
    
    public static void main(String[] args) {
        
        int a = 5, b = 3, func;
        Scanner bar = new Scanner(System.in);
        
        System.out.println("Toplama için 0 giriniz\n"
                + "Çikarma için 1 giriniz\n"
                + "Çarpma için 2 giriniz\n"
                + "Bölme için 3 giriniz");
        
        func = bar.nextInt();
        
        if(func == 0){
            //toplama
        }else if(func == 1){
            //çikarma
            System.out.println(Çıkarma(a, b));
        }else if(func == 2){
            //çarpma
        }else if(func == 3){
            //bölme
        }else{
            System.out.println("Hatali islem");
        }
        
    }
    
    public static int Çıkarma(int a, int b){
        return a - b;
    }
    
}
