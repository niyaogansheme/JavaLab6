import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
    public static void main(String[] args) {
        Map<Character, Character> decodeMap = new HashMap<>();
        decodeMap.put('a', 'c');
        decodeMap.put('b', 'r');
        decodeMap.put('c', 'm');
        decodeMap.put('d', 'n');
        decodeMap.put('e', 'f');
        decodeMap.put('f', 'g');
        decodeMap.put('g', 'h');
        decodeMap.put('h', 'i');
        decodeMap.put('i', 'j');
        decodeMap.put('j', 'k');
        decodeMap.put('k', 'l');
        decodeMap.put('l', 'a');
        decodeMap.put('m', 'b');
        decodeMap.put('n', 'o');
        decodeMap.put('o', 'p');
        decodeMap.put('p', 'q');
        decodeMap.put('q', 's');
        decodeMap.put('r', 't');
        decodeMap.put('s', 'u');
        decodeMap.put('t', 'v');
        decodeMap.put('u', 'w');
        decodeMap.put('v', 'x');
        decodeMap.put('w', 'y');
        decodeMap.put('x', 'z');
        decodeMap.put('y', 'd');
        decodeMap.put('z', 'e');

        String encrypted = "G tgsl Qefe.";
        String decoded = "";

        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            char lowerC = Character.toLowerCase(c);
            if (decodeMap.containsKey(lowerC)) {
                char target = decodeMap.get(lowerC);
                if (Character.isUpperCase(c)) {
                    decoded = decoded + Character.toUpperCase(target);
                } else {
                    decoded = decoded + target;
                }
            } else {

                decoded = decoded + c;
            }
        }
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decoded: " + decoded);
    }
}