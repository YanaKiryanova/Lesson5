package org.example;
/*Создайте двумерный массив целых чисел. Отсортируйте элементы в
        строках двумерного массива по возрастанию.*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ex1();
      ex2();
      ex3();
      ex4();


    }
    public static void ex1(){
        System.out.println("-----------------Ex1------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число на которое увеличивается каждая цифра трехмерного массива");
        int plus = 0;
        if (sc.hasNextInt()){
            plus = sc.nextInt();
        }
        int [][][] mas = new int[3][3][3];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int k = 0; k < mas.length; k++) {
                    System.out.print("[" + i + "][" + j + "][" + k + "] = " + "[" + (i + plus) + "][" + (j + plus) + "][" + (k + plus) + "]"  + "\t");
                }
                System.out.println();
            }

        }
        sc.close();
    }
    public static void ex2(){
        System.out.println();
        System.out.println("-----------------Ex2------------");
        String [][] chessBoard = new String[8][8];
        for(int i = 0; i < chessBoard.length; i++ ){
            for (int j = 0; j <chessBoard.length; j++){
               if ((i + j) % 2 == 0){
                   chessBoard[i][j] = "W";
               }else{
                   chessBoard[i][j] = "B";
               }
             }
        }
        for(int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void ex3(){
        System.out.println();
        System.out.println("-----------------Ex3------------");
        int [][] mas = {{5,5,5,5}, {5,5,5,5}, {5,5,5,5}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += mas[i][j];
            }
        }
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма чисел массива " + sum);
    }
    public static void ex4(){
        System.out.println();
        System.out.println("-----------------Ex4------------");
        int [][] mas = {{2,3,8,5}, {9,4,6,2}, {4,9,2,7}, {4,7,6,5}};
        System.out.println("Было");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + mas[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Стало");
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                Arrays.sort(mas[j]);
                System.out.print(" " +mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}