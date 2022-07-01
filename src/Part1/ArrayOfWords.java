package Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayOfWords {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Капуста");
        words.add("Свинина");
        words.add("Картофель");
        words.add("Капуста");
        words.add("Конфеты");
        words.add("Макароны");
        words.add("Авокадо");
        words.add("Конфеты");
        words.add("Курица");
        words.add("Ананас");
        System.out.println("Исходный список слов: "+ words);
        HashSet<String> uniqueWords = new HashSet<>(words);
        System.out.println("Уникальные слова: " +uniqueWords);
        System.out.println("Количество уникальных слов: " + uniqueWords.size());
        }



    }


