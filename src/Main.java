import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        System.out.println("1)Виведення колекції " + colors);


        System.out.println("2)Ітерація по всіх елементах списку масиву");
        for (String color : colors) {
            System.out.println(color);
        }


        System.out.println("3)Вставка елемента у список масиву на першу позицію");
        colors.add(0, "orange");
        System.out.println(colors);


        System.out.println("4)Отримання елемента (за заданим індексом) зі списку масиву");
        String element = colors.get(3);
        System.out.println(element);


        System.out.println("5)Оновлення конкретного елемента списку заданим елементом");
        String element1 = colors.set(1, "black");
        System.out.println(colors);


        System.out.println("6)Видалення третього елемента зі списку масиву");
        String element3 = colors.remove(2);
        System.out.println(colors);


        System.out.println("7)Пошук елемента у списку масиву");
        String element4 = "pink";
        boolean result = colors.contains(element4);
        System.out.println(result);


        System.out.println("8)Сортування заданого списку масиву");
        Collections.sort(colors);
        for (String i : colors) {
            System.out.println(i);
        }


        System.out.println("9)Копіювання одного списку масиву в інший ");
        ArrayList colors2 = (ArrayList)colors.clone();
        colors2.set(0, "white");
        System.out.println(colors);
        System.out.println(colors2);


        System.out.println("10)Реверсування елементів у списку масиву ");
        Collections.reverse(colors);
        System.out.println(colors);


        System.out.println("11)Порівняння двох списків масиву");
        boolean areEqual = colors.equals(colors2);
        System.out.println(areEqual);

        System.out.println("12)Очищення списку масиву");
        colors.clear();
        System.out.println(colors);

        System.out.println("13)Перевірка, чи список масиву є порожнім");
        boolean IsEmpty = colors.isEmpty();
        System.out.println(IsEmpty);


        System.out.println("14)Збільшення розміру списку масиву");
        ArrayList<String> list2 = new ArrayList<>();
        list2.ensureCapacity(20); // просто резервує місце
        list2.add("white");
        list2.add("black");
        list2.add("yellow");
        list2.add("red");
        System.out.println(list2);


        System.out.println("15)Обрізання місткості списку масиву до поточного розміру");
        list2.trimToSize();
        System.out.println(list2);
        System.out.println(list2.size());
    }

