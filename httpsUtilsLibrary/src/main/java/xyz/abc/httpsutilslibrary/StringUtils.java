package xyz.abc.httpsutilslibrary;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {
    public StringUtils() {
    }

    public static boolean IsNullOrWhiteSpace(String value) {
        return value == null || value == "" || value.length() == 0 || value == " " || value.trim() == "" || value.trim() == " ";
    }

    public static boolean IsNullOrWhiteSpace(Object value) {
        return value == null || IsNullOrWhiteSpace(String.valueOf(value));
    }

    public static String unAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
    }
}
