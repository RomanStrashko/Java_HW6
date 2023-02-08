//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
// соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.Random;

public class Laptop {
    Random random = new Random();
    String name;
    int ram;
    int hardDrive;
    String operatingSystem;
    String color;

    String ranval(ArrayList<String> list) {
        return list.get(random.nextInt(list.size()));
    }
    int ranint(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String toString() {
        return "name" + "-" + name + "," + "RAM" + "-" + ram + "," + "HardDrive" + "-" + hardDrive + "," + "OperatingSystem" + "-"
        + operatingSystem + "," + "Color" + "-" + color;
    }

}