import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private ArrayList<String> strings;

    public void randomMethod() {
        System.out.println("jwdooj");
    }
    public Main() {
        strings = new ArrayList<>();
    }

    // 1. Добавление и удаление объектов
    public void addString(String str) {
        strings.add(str);
    }

    public void removeString(String str) {
        strings.remove(str);
    }

    // 2. Поиск одинаковых элементов с подсчетом совпадений
    public int countOccurrences(String str) {
        int count = 0;
        for (String s : strings) {
            if (s.equals(str)) {
                count++;
            }
        }
        return count;
    }

    // 3. Выгрузка в xml-файл
    public void exportToXml(String filePath) {
        // Реализуйте код для экспорта коллекции в XML-файл
    }

    // 4. Реверс всех строк, входящих в коллекцию
    public void reverseStrings() {
        Collections.reverse(strings);
    }

    // 5. Статистика по всем символам, содержащимся в строках коллекции
    public Map<Character, Integer> characterStatistics() {
        Map<Character, Integer> statistics = new HashMap<>();
        for (String str : strings) {
            for (char c : str.toCharArray()) {
                statistics.put(c, statistics.getOrDefault(c, 0) + 1);
            }
        }
        return statistics;
    }

    // 6. Поиск подстроки в строках коллекции
    public List<String> searchSubstring(String substring) {
        List<String> matchingStrings = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                matchingStrings.add(str);
            }
        }
        return matchingStrings;
    }

    // 7. Инициализация листа по текстовому файлу и вывод содержимого коллекции на экран
    public void initializeFromFile(String filePath) {
        // Реализуйте код для чтения файла и инициализации коллекции из него
    }

    public void printStrings() {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // 8. Расширение функциональности класса ArrayList методом compareInnerObjects
    public boolean compareInnerObjects(int firstIndex, int secondIndex) {
        if (firstIndex < 0 || firstIndex >= strings.size() ||
                secondIndex < 0 || secondIndex >= strings.size()) {
            return false;
        }
        String str1 = strings.get(firstIndex);
        String str2 = strings.get(secondIndex);
        // Реализуйте свою логику сравнения объектов типа String
        return str1.equals(str2);
    }

    // 9. Подсчет длин строк и вывод результатов в упорядоченном виде
    public void calculateAndPrintLengths() {
        List<Integer> lengths = new ArrayList<>();
        for (String str : strings) {
            lengths.add(str.length());
        }
        Collections.sort(lengths);
        for (int length : lengths) {
            System.out.println(length);
        }
    }

    // 10. Реализация добавления объектов с ограничением по размеру коллекции
    public void addLimitedSize(String str, int maxSize) {
        if (strings.size() < maxSize) {
            strings.add(str);
        } else {
            strings.remove(0);
            strings.add(str);
        }
    }
}