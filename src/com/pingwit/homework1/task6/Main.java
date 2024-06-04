package com.pingwit.homework1.task6;

public class Main { // старайся для классов придумывать названия, согласно таске, например TwoNumbersMultiply, это хороший способ постепенно привыкать в хорошему именованию
    public static void main(String[] args) {
        // я понимаю почему ты выбрал byte, но лучше использовать int/Integer.
        byte firstVar = 25;  // firstVar -> здесь не критично, но Var в названиях лучше не использовать. У тебя переменная хранит число, можно назвать firstNumber
        int secondVar = 300; // см комментарий выше
        int result = firstVar * secondVar;
        System.out.println(result);
    }
}
