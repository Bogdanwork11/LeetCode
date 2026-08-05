package com.example.demo;

import java.util.Arrays;

public class Solution {
    //Задание: Вам дан массив целых чисел nums и целое число target. Верните индексы этих двух чисел так, чтобы их сумма равняласьtarget .
    //
    //Можно предположить, что для каждого входного значения существует ровно одно решение , и нельзя использовать один и тот же элемент дважды.
    //
    //Вы можете вернуть ответ в любом порядке.

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; //размер массива
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++){
                    if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
    }
    return new int[]{};

}
    // --- МЕТОД ДЛЯ ПРОВЕРКИ И ВВОДА ДАННЫХ ---
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 1. Вводим входные данные
        int[] nums = {2, 7, 11, 15}; // Сам массив
        int target = 9;              // Искомая сумма (2 + 7 = 9)

        // 2. Вызываем метод
        int[] result = solution.twoSum(nums, target);

        // 3. Выводим результат в консоль
        // Arrays.toString красиво превратит массив индексов в строку вида [0, 1]
        System.out.println("Индексы элементов: " + Arrays.toString(result));
    }
}

