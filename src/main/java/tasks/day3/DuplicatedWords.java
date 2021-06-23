package main.java.tasks.day3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/* 2.1 Найти и вывести в консоль все дубликаты слов в строке текста*/

public class DuplicatedWords {

    public void DeleteDuplicates() {
        String duplicatePattern = "(?i)\\b(\\w+)\\b[\\w\\W]*\\b\\1\\b";
        Pattern p = Pattern.compile(duplicatePattern);
        String phrase = "How much wood could a woodchuck chuck if a wooodchuck could chuck wood?" +
                "A woodchuck could chuck as much wood as a woodchuck wouldchuck" +
                " if a woodchuck could chuck wood.";
        Matcher m = p.matcher(phrase);
        while (m.find()) {
            System.out.println("Duplicate word: " + m.group(1) + "\n");
        }
    }
}

