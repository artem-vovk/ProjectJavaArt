package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* непонятная для меня тема
        int a = 9;
        switch (a) {
            case 0: System.out.print ("0");
            case 5: System.out.print ("5"); break;
            case 9: System.out.print ("9");
            case 10: System.out.print ("10"); break;
            default: System.out.print ("!");
        }

    }
}

         */

        /* нужно взять строку, и вернуть назад масив стринг из двух єлементов, первій єлемент єто страка с первой заглавной пуквой, а второй єлемент - строка с последнией заглавной буквой

        String originalString = "привет";
        int indexOfLastLetter = originalString.length() - 1;
        String lastLetter = originalString.substring(indexOfLastLetter).toUpperCase();
        String firstLetter = originalString.substring(0, 1).toUpperCase();
        String firstEnd = firstLetter + originalString.substring(1);
        String LastEnd = originalString.substring(0, indexOfLastLetter) + lastLetter;

        String[] myStringArray = new String[] {firstEnd, LastEnd};

        //сначала определяем индекс последнего символа, потом обрезаем строку с переди, потом обрезаем сзади и делаем конкотенацию, а затем переводим строку в массив


        System.out.println(firstEnd + " " + LastEnd);
    }
}

         */







/*

// вытягиваем из одной строки в другую элемент с четным индексом
        String originalString = "012345678923456789"; // стартовая строка
        StringBuilder newString = new StringBuilder(); // создаем новую строкув стрингбилдере
        for (int i = 0; i < originalString.length(); i += 2) { // запускаем цикл с шагом через один элемент
            newString.append(originalString.charAt(i)); // дозаписываем данные в новую строку из циклом с шагом два
        }
        System.out.println(newString.toString()); // выводим на печать + проводим toString - Это наверное чтобы окночательно создать строку на базе стрингбилдера

    }
}

 */





        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();
        System.out.println(word);
        System.out.println(getModiffString(word));
    }

    private static String getModiffString(String sourceStr) {
        StringBuilder charBox = new StringBuilder();
        int counter = 0;
        while (counter < sourceStr.length()) {
            charBox.append(sourceStr.charAt(counter));
            counter += 2;
        }
        return charBox.toString();
    }
}


         */

     /* Определяем середину строки и выводим на печать, если нечетное число символов, то выводим 1 символ, четное - 2 символа

        System.out.println("A       --> " + getMiddleString("A"));
        System.out.println("AB      --> " + getMiddleString("AB"));
        System.out.println("ABCDEFG --> " + getMiddleString("ABCDEG"));
    }
    private static String getMiddleString(String str) { // этим методом мы проводим вычисление и возвращаем данные в прошлый метод для вывода на печать
        if (str.length() <= 2) { // указываем, что если строка имеет два и менее символа, то просто выводим эти символы и все
            return str;
        } else { // если знаков в строке болье 2-х, тогда продолжаем
            int beginIndex = (str.length() - 1) / 2; // опредеяем начальный индекс
            int endIndex = beginIndex + 2 - (str.length() % 2); // определяем конечный индекс
            return str.substring(beginIndex, endIndex); // возвращаем субстринг 1 или 2 буквы из середины строки
        }
    }
}

*/

/* просто возвращаем тру если строки совпадают и если строки пустые - тоже тру
        String firstString = "ddd";
        String secondString = "555";
        if (firstString == null && secondString == null) { // если обе строки НУЛЬ - то тру
        return true;
    } else if (firstString == null || secondString == null) { // если одна из строк НУЛЬ, то фальс
        return false;
    } else if (firstString.length() == 0 && secondString.length() == 0) { // если строка пустая , то тру
        return true;
    } else {
        return firstString.equals(secondString); // возвращаем результат сравнения
    }
}
}
*/
        /* делаем абривиатуру из первых букв слов в строке


        String fullName = "Юридическое агентство Щит и Меч";
        String firstLetter = fullName.substring(0, 1); // определили первую букву первого слова
        String abrv = firstLetter;  // 1 шаг - создали новую строку = в которую мы будем дозаписывать первые буквы найденные в цикле
        char[] fullName2 = fullName.toCharArray(); // сделали масив из строки
        for (char i = 0; i < fullName2.length; i++) { // 2 запустили цикл
            if (fullName2[i] == ' ') { // определили индекс едемента - первой букві каждого слова после пробела
                char nextLetter = fullName2[i + 1];  // сразу вывели букву в соответствующую переменную
                abrv += nextLetter; // дописать в строку abrv букву из цикла
                // меняли тип данных не нужно
            }
        }
        abrv = abrv.toUpperCase(); // после цикла сделать все буквы заглавными
        System.out.println(abrv); // вернуть цикл в метод / а здесь можно просто вывести на печать
    }
}

*/


      /*  int indexLetter = fullName.indexOf(' ');

        char[] fullName2 = fullName.toCharArray(); // преобразуем массив из строки с типом данных char
        char firstLetter = fullName2[0];
        for (char i = 0; i < fullName2.length; i++) {
            if  (fullName2[i] == ' ') {
                int indexLetter = fullName2.indexOf(' ');
              /*  char nextLetter =  fullName2[i+1];

                char othersLetter = new char(firstLetter + nextLetter);
               // fullName2 =  fullName2[0] ;
            }
            System.out.println(indexLetter);
        }
    }
}
*/
     /* задача по определению слов которые читают аналагочно задом наперед


        String target = "rotatorA"; //Исходная строка
        StringBuilder myStringBuilder = new StringBuilder(target); // создаем метод и переменную СтрингБилдер из прошлой строки
        StringBuilder myReverse = myStringBuilder.reverse(); // создаем переменную май реверс и реверсиуем предыдущее занчение
        String myReversedString = myReverse.toString(); // создаем строку из myReverse
        Boolean  zombee = false;
        if (myReversedString.equals(target)) {
            zombee = true;
        }
        System.out.println(zombee); //
    }
}
        /*
        myRevese.append(target)
        StringBuilder myRevese = target.reverse();
        String myRevesed = myRevese.toString();
        System.out.println(myRevesed);
*/
       /*
        String target = "rotator";
        StringBuilder target = new StringBuilder();
        StringBuilder myRevese = new StringBuilder();
        String targetRevers = target.revers();
        if (target == targetRevers) {
            System.out.println(targetRevers);
        }

        */








     /* определяем процентное соотношение цифры 1 по отношению к общему количеству цифр

        String statistic = "0000111111111111";
        char[] StatisticArray = statistic.toCharArray(); // перевел строку в массив - с типом данных char
        double amountStudents = StatisticArray.length; // количество студентов
        double understood = 0;
        double percentMy = 0;
        if (statistic.isEmpty() == true) {
            percentMy = 0;
        } else {
            for (char i : StatisticArray) {
                if (i == '1') understood++;
                percentMy = understood / amountStudents;
            }
        }
        System.out.println(percentMy);
    }
}

*/