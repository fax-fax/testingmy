package com.company;
//import SocketServer;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Start/RU: Старт");
        //создаем объект класса SocketServer
       // SocketServer ss= new SocketServer();
       // ss.main(args);
//01.02.21 Ветка обучения 1
        System.out.println("Start/RU: Старт. 01.02.21");
       // DebuggingList dl= new DebuggingList(); //создаем объект

        //задание вывести 5 раз сообщение
        for (int i = 1; i <= 5; i++){
            System.out.println("Элли самая красивая");
        }
        //
        System.out.println("Новое задание");
        //задание вывести 5 раз сообщение
        int i = 3126;
        i=i-8;
        System.out.println("Мой друг родился 8 лет назад, в "+i+" году");
        //
        System.out.println("Новое задание");
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }
}
