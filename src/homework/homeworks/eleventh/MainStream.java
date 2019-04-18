package homework.homeworks.eleventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.util.Comparator.reverseOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class MainStream {
    static String regex = "\\W";
    static Pattern p = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null && !currentLine.equals("")) {
                String[] splitted = p.split(currentLine);
                for (String s : splitted) {
                    if (!s.equals("")) {
                        words.add(s);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> result =
                words.stream()
                        .map(x -> x.toLowerCase())
                        .collect(groupingBy(identity(), counting()))
                        .entrySet().stream()
                        .sorted(Map.Entry.<String, Long>comparingByValue(reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                        .limit(10)
                        .map(Map.Entry::getKey)
                        .collect(toList());
        result.forEach(System.out::println);
    }
}

