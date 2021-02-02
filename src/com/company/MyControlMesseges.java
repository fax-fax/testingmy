package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyControlMesseges {

        public static void DebuggingList() {
            List<ControlMessege> сontrolMesseges = new ArrayList<>(); // создали новый объект

            //заполнение данными
            ControlMessege firstmess = new ControlMessege("Запуск", 21);
            ControlMessege secondmess = new ControlMessege("Выполнение", 22);
            ControlMessege thirdmess = new ControlMessege("Выход", 23);

            сontrolMesseges.add(firstmess);
            сontrolMesseges.add(secondmess);
            сontrolMesseges.add(thirdmess);
            System.out.println(сontrolMesseges);
        }
}
