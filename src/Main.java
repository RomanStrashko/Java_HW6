import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> arrayListOS = new ArrayList<>();
        arrayListOS.add("MacOS");
        arrayListOS.add("Linux");
        arrayListOS.add("Windows");
        arrayListOS.add("DOS");

        ArrayList<String> arrayListCol = new ArrayList<>();
        arrayListCol.add("red");
        arrayListCol.add("silver");
        arrayListCol.add("black");
        arrayListCol.add("white");
        arrayListCol.add("blue");

        Laptop HP = new Laptop();
        creatobj("HP", HP, arrayListOS, arrayListCol);

        Laptop ASUS = new Laptop();
        creatobj("ASUS", ASUS, arrayListOS, arrayListCol);

        Laptop Apple = new Laptop();
        creatobj("Apple", Apple, arrayListOS, arrayListCol);

        Laptop Xiaomi = new Laptop();
        creatobj("Xiaomi", Xiaomi, arrayListOS, arrayListCol);

        Laptop Lenovo = new Laptop();
        creatobj("Lenovo", Lenovo, arrayListOS, arrayListCol);

        System.out.println(HP);
        System.out.println(ASUS);
        System.out.println(Apple);
        System.out.println(Xiaomi);
        System.out.println(Lenovo);

        ArrayList<Laptop> arraylist = new ArrayList<>();
        arraylist.add(HP);
        arraylist.add(ASUS);
        arraylist.add(Apple);
        arraylist.add(Xiaomi);
        arraylist.add(Lenovo);
        System.out.println(arraylist);

        Map<Integer, Object> map =new HashMap<>();
        map = request();
        System.out.println(map);
        System.out.println(filtr(arraylist, map));

    }

    static void creatobj(String name, Laptop lap, ArrayList<String> listOS, ArrayList<String> listCol){
        Random random = new Random();
        lap.name = name;
        lap.ram = lap.ranint(1, 32);
        lap.hardDrive = lap.ranint(100, 1000);
        lap.operatingSystem = lap.ranval(listOS);
        lap.color = lap.ranval(listCol);


    }

    static Map<Integer, Object> request(){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> map = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                while (true) {
                    System.out.println("Укажите минимальные значения от 1 до 32 гб");
                    int r = scanner.nextInt();
                    if (r < 1 || r > 32) {
                        System.out.println("Ошибка, попробуйте снова!");
                        continue;
                    }
                    map.put(1, r);
                    break;
                }
            case 2:
                while (true) {
                    System.out.println("Укажите минимальные значения от 100 до 1000 гб");
                    int n = scanner.nextInt();
                    if (n < 100 || n > 1000) {
                        System.out.println("Ошибка, попробуйте снова!");
                        continue;
                    }
                    map.put(2, n);
                    break;
                }
            case 3:
                while (true) {
                    System.out.println("Укажите номер операционной системы из списка\n" +
                            "1. MacOS\n" +
                            "2. Linux\n" +
                            "3. Windows\n" +
                            "4. DOS");
                    int s = scanner.nextInt();
                    if (s < 1 || s > 4) {
                        System.out.println("Ошибка, попробуйте снова!");
                        continue;
                    }
                    switch (s){
                        case 1:
                            map.put(3, "MacOS");
                            break;
                        case 2:
                            map.put(3, "Linux");
                            break;
                        case 3:
                            map.put(3, "Windows");
                            break;
                        case 4:
                            map.put(3, "DOS");
                            break;
                    }
                    break;
                }
            case 4:
                while (true) {
                    System.out.println("Укажите номер цвета из списка\n" +
                            "1. red\n" +
                            "2. silver\n" +
                            "3. black\n" +
                            "4. white\n" +
                            "5. blue");
                    int t = scanner.nextInt();
                    if (t < 1 || t > 5) {
                        System.out.println("Ошибка, попробуйте снова!");
                        continue;
                    }
                    switch (t) {
                        case 1:
                            map.put(4, "red");
                            break;
                        case 2:
                            map.put(4, "silver");
                            break;
                        case 3:
                            map.put(4, "black");
                            break;
                        case 4:
                            map.put(4, "white");
                            break;
                        case 5:
                            map.put(4, "blue");
                            break;
                    }
                    break;
                }
                break;
            default:
                System.out.println("Вы ввели не верное чило, повторите еще раз!");

        }
        return map;

    }

    static ArrayList<Laptop> filtr(ArrayList<Laptop> arrayList, Map<Integer, Object> map){
        ArrayList<Laptop> list = new ArrayList<>();
        for(Laptop item : arrayList) {
            if ((int) map.get(1) <= 2 && item.ram <= 2) {
                list.add(item);
            } else if ((int) map.get(2) < 200 && item.hardDrive < 200) {
                list.add(item);
            } else if (map.get(3).equals(item.operatingSystem)) {
                list.add(item);
            } else if (map.get(4).equals(item.color)) {
                list.add(item);
            }

        }
        return list;
    }
}
