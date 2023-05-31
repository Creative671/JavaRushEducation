package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
//Выведи на экран третью строку в неизменном виде.
//Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
        Scanner scanner = new Scanner(System.in);

        String textFirst = scanner.nextLine();
        String textSecond = scanner.nextLine();
        String textThird = scanner.nextLine();

        System.out.println(textThird);
        System.out.println(textSecond.toUpperCase());
        System.out.println(textFirst.toLowerCase());
    }
}
