package com.example.demo;

public class Main {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode resultListHead = null; //голова связного списка
        ListNode resultLastNode = null; //конец связного списка| сюда обычно записывается если 8 + 5 = 13 и пишется 3йка а 1 идет на ум и идет в головной связынй список

        int carry = 0; //позволяет передать переплненный десяток на следующий, на следующий, более старший разряд(это и есть типо того что дожится на уме)

        while (!(l1 == null && l2 == null)) { //пока список l1 и l2 не будет равен 0 цикл будет жить
           int digit1 = l1 == null ? 0 : l1.val; //(?- это тернарный оператор, после него записывается значение 0,  либо же если l1 не null то берется значение текущего узла как l1.val
           int digit2 = l2 == null ? 0 : l2.val; //(?- это тернарный оператор, после него записыватся значения как 0, если будет равен null, либо же если l2 не null то берется значение как l2.val


            int sum = digit1 + digit2 + carry;

            int newDigit = sum%10; // а этот идет в головной и дает понимание что берем на ум
            carry = sum / 10; //он и идет в хвостовой связный список

            ListNode newNode = new ListNode(newDigit);
            if(resultListHead == null){
                resultListHead = newNode;
            } else {
                resultLastNode.next = newNode;
            }
            resultLastNode = newNode;


            if (l1 != null) l1 = l1.next; //тут мы даем понять, что если в связном списке l1 != null то чтобы перейти к следующему элементу используется l1.next

            //next используется в связном списке как инкремент в обычном списке l1++

            if (l2 != null) l2 = l2.next; //тут мы даем понять, что если в связном списке l2 != null то чтобы перейти к следующему элементу используется l2.next



        }
        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            resultLastNode.next = newNode;
        }
        return resultListHead;

    }
    // --- МЕТОД ДЛЯ ЗАПУСКА И ТЕСТИРОВАНИЯ ---
    public static void main(String[] args) {
        Main solution = new Main();

        // 1. Создаем первый список l1 = [2, 4, 3] (число 342)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // 2. Создаем второй список l2 = [5, 6, 4] (число 465)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // 3. Вызываем наш метод
        ListNode result = solution.addTwoNumbers(l1, l2);

        // 4. Выводим результат в консоль
        System.out.print("Результат: ");
        printList(result);
    }

    // Вспомогательный метод, чтобы красиво напечатать связный список в консоль
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}






//--logical explain:
//Вам даны два непустых связанных списка, представляющих два неотрицательных целых числа. Цифры хранятся в обратном порядке , и каждый из их узлов содержит одну цифру. Сложите два числа и верните сумму в виде связанного списка.
//
//Можно предположить, что эти два числа не содержат ведущих нулей, за исключением самого числа 0.

//Заданый пример чисел:

// 2 -> 4 -> 3 | 342 - получается что заданные числа даны в обраьтном порядке
// 5 -> 6 -> 4 | 465 - получается что и тут числа даны в обратном порядке
// -----------
// 7 -> 0 -> 8 | 807 - получается что тут и ответ получается в обратном порядке

//1-тут на уме
//342 +
//465 +
//-----
// 807

//Входные данные: l1 = [2,4,3], l2 = [5,6,4]
//Выходные данные: [7,0,8]
//пояснение: 342+465 = 807