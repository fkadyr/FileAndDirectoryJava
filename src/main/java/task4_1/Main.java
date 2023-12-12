package task4_1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        File root = new File("."); //Указываем путь к текущему каталога
        ArrayList<File> expand = new ArrayList<File>(); // Создаем список объектов File список в, котором хранятся элементы катологов;
        expand.add(root); // Добавляем корень каталога в наш список expand

        for (int depth = 0; depth < 10; depth++) { // Потом мы открываем цикл и ставим значения до какого уровня мы хотим посмотреть наш основной каталог.
            File[] expandCopy = expand.toArray(new File[expand.size()]); // Создаем массив в который мы положили элементы каталога определенного уровня.
            expand.clear(); // Удаляем элементы списка expand
            for (File file : expandCopy) { // Заходим в цикл, проходим через все элементы каталога.
                System.out.println(depth + " " + file); // Печатаем в консоль глубину, и название каталога.
                if (file.isDirectory()) { // Проверяем если элемент каталога подкаталог,
                    expand.addAll(Arrays.asList(file.listFiles())); // то элементы этого подкаталога добавляем в наш список (Этот список для следующего уровня).
                }
            }
        }
    }
}