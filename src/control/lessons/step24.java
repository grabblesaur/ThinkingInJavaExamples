package control.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Найти все числа-вампиры.
    Во-первых, каждое из них должно состоять из количества цифр,
    вдвое меньшего, чем у исходного числа.
    Во-вторых, если в одном из них последняя цифра ноль,
    то другое оканчиваться нулем не может.
    В-третьих, исходное число должно в любом порядке содержать все цифры, входящие в «клыки»
    Пример: 1827 = 21 * 87
 */
public class step24{
    public static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            List<Integer> iDigits = createListOfDigits(i);
            validateForVampire(iDigits, i);
        }
        System.out.println(result);
    }//end main

    private static List<Integer> createListOfDigits(int number) {
        int fourth = number % 10;
        int third = (number % 100 - fourth) / 10;
        int second = (number % 1000 - third) / 100;
        int first = (number % 10000 - second) / 1000;
        List<Integer> listOfDigits = Arrays.asList(first, second, third, fourth);
        return listOfDigits;
    }

    private static void validateForVampire(List<Integer> digits, int number) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    continue;
                int[] left = {digits.get(i), digits.get(j)};
                List<Integer> right = new ArrayList<>();

                for (int k = 0; k < 4; k++) {
                    if (k != i && k != j)
                        right.add(digits.get(k));
                }// end of third for

                if ((right.get(1) == 0 || right.get(0) == 0) && (left[1] == 0 || left[0] == 0))
                    continue;
                boolean variant_1 = (left[0] * 10 + left[1]) * (right.get(0) * 10 + right.get(1)) == number;
                boolean variant_2 = (left[0] * 10 + left[1]) * (right.get(1) * 10 + right.get(0)) == number;
                boolean variant_3 = (left[1] * 10 + left[0]) * (right.get(0) * 10 + right.get(1)) == number;
                boolean variant_4 = (left[1] * 10 + left[0]) * (right.get(1) * 10 + right.get(0)) == number;

                if ((variant_1 || variant_2 || variant_3 || variant_4) && !result.contains(number))
                    result.add(number);
            }// end of second for
        }// end of first for
    }
}