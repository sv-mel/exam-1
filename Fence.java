//Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
//На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
//Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
// поместится ли на забор такой длины надпись мальчика.


public class Fence {

    final int sumLetters = 15;
    final int sumSpace = 3;
    final int lengthThreeLetters = 62;
    final int lengthSpace = 12;

    //Вычисление минимальной длины забора
    int minLength = lengthThreeLetters * sumLetters / sumSpace + lengthSpace * sumSpace;

    public void compareSumLength (int length) {

        if (length >= minLength) {
            System.out.println("Надпись поместится на забор " + Math.floorDiv(length, minLength) + " раз");
        } else {
            System.out.println("Надпись не поместится");
        }
    }
}
