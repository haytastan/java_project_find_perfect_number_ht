package com.hayatitastan;
/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        // mükemmel sayı bulma
        // mükemmel sayı: keniden başka tüm tam bölenlerinin toplamı, kendisine eşit olan sayıdır.
        // örnek 6 mükemmel sayıdır. Bu sayı bire, ikiye, üçe bölünür
        // ve tüm bu bölenlerin toplamı, sayının kendisine eşittir:  1+2+3 =6
        // 6 --> 1,2,3
        // 28 --> 1,2,4,7,14

        int number = 28;
        int remainder;
        int total=0;

        for(int i = 1; i<number; i++) {
            remainder = number % i; //number, başka sayıya bölününce kalan değer
            if (remainder==0) {
                total = total +i;
            }
        }
        if (total == number){
            System.out.println(number + " MÜKEMMEL SAYIDIR.");
        }else{
            System.out.println(number + " MÜKEMMEL SAYI DEĞİLDİR.");
        }

    }
}
