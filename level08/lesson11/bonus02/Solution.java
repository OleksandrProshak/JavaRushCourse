package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> adresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();


            if (city.isEmpty()) {
                break;
            } else {
                String firstName = reader.readLine();
                adresses.put(city, firstName);
            }

        }
        //System.out.println("enter city");
        String compareCity = reader.readLine();

        for (Map.Entry<String, String> pair : adresses.entrySet()) {
            if (pair.getKey().equals(compareCity)) {
                System.out.println(pair.getValue());
            }
        }
    }
}



//        List<String> addresses = new ArrayList<String>();
//        while (true)
//        {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
