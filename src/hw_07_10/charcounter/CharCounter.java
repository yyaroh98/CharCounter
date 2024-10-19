package hw_07_10.charcounter;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    private String string;

    public CharCounter(String string) {
        setString(string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Map<Character, Integer> getCharValue() {
        char[] chars = string.toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (charCounter.get(chars[i]) == null) {
                charCounter.put(chars[i], 1);
            } else {
                charCounter.put(chars[i], charCounter.get(chars[i]) + 1);
            }
        }
        return charCounter;
    }
}
