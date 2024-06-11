import javax.swing.*;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {

        int n = 0;
        boolean validInput = false;
        
        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Введите размер массива (целое число):");
            if (input == null) {
                return; 
            }
            try {
                n = Integer.parseInt(input);
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "Размер массива должен быть положительным целым числом.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод: введите целое число.");
            }
        }

        int[] array = new Random().ints(n, 0, 101).toArray();
        int[] reversedArray = new int[n];

        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }

        StringBuilder originalArrayStr = new StringBuilder("Исходный массив:\n");
        for (int num : array) {
            originalArrayStr.append(num).append("\n");
        }

        StringBuilder reversedArrayStr = new StringBuilder("Обращенный массив:\n");
        for (int num : reversedArray) {
            reversedArrayStr.append(num).append("\n");
        }


        JOptionPane.showMessageDialog(null, originalArrayStr.toString() + "\n" + reversedArrayStr.toString());
    }
}
