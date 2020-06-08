package com.company;
import java.util.Scanner;
class Main
{
    public static void bbbbb()
    {
        Scanner meow =  new Scanner( System.in);
        System.out.print("Введите римское число(только заглавные буквы!): ");
        String bla =  meow.nextLine();
        char [] bee = bla.toCharArray();
        int xiusoo = 0;
        for(int kiho =  0; kiho <  bee.length; kiho++) if(bee[kiho] ==  'M') xiusoo += 1000;
        else if(bee[kiho] == 'D') xiusoo += 500;
        else if(bee[kiho] == 'C')if( kiho + 1 <  bee.length &&  (bee[kiho +  1] ==  'D' ||  bee[kiho +  1 ] == 'M')) xiusoo -= 100;
        else xiusoo += 100; else if(bee[kiho] == 'L') xiusoo += 50;
        else if(bee[kiho] == 'X') if( kiho + 1 < bee.length && (bee[kiho + 1] == 'L' || bee[kiho + 1] == 'C' || bee[kiho + 1] == 'M')) xiusoo-=10;
        else xiusoo += 10;
        else if(bee[kiho] == 'V') xiusoo += 5;
        else if(bee[kiho] == 'I') if (kiho + 1 < bee.length && (bee[kiho + 1] == 'V' || bee[kiho + 1] == 'X' || bee[kiho + 1] == 'C')) xiusoo -= 1;
        else xiusoo += 1;

        System.out.print("Арабское число: " + xiusoo);
    }
    public static void palindrom()
    {
        Scanner kiwon = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите число для проверки палендрома");
        String meow = kiwon.nextLine();
        StringBuffer rrrr = new StringBuffer(meow);
        rrrr.reverse();
        String p = rrrr.toString();
        if(meow.equals(p)) System.out.print("Палендром");
        else System.out.print("Не палендром");
    }
    public static void main(String[] args)
    {
        bbbbb();
        palindrom();
    }
}