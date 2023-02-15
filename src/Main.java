/*
Задача №3_Массивы
Инструкция
Выполните следующие действия с массивом:
1. Задайте массив из 5 любых целых чисел
2. Поменяйте местами первый и последний элемент в массиве
3. Вывести в консоль результат суммы первого и среднего элемента
Примечание: Для получения последнего и среднего элементов в массиве используйте
свойство length.
Выполненное задания нужно залить в гит и оставить ссылку в поле "Ответ" под за-
данием к курсу. Задание автоматически уйдет на оценку преподавателю.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        int[] arr = { 7, 8, 12, 22, 28 };
        System.out.print("arr (после инициализации) = {");
        System.out.print(arr[0]);
        for (int i = 1; i< arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");

        // Меняем элементы местами
        int tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;

        System.out.print("arr (после перестановки)  = {");
        System.out.print(arr[0]);
        for (int i = 1; i< arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");

        System.out.println("Сумма первого и среднего элементов массива = " + (arr[0] + arr[arr.length / 2]));
        System.out.println();
    }
}
