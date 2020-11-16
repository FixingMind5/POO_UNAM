package practica_dieciseis;

public class Cesar {
    private static String table = 
        "abcdefghijklmnñopqrstuvwxyzáéíóú 1234567890" +
        ".,;:-+*/$#?=()[]{}";

    public static String encrypt(String text, int key) {
        cleanString(text);
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            Character textCharacter = text.charAt(i);
            int position = table.indexOf(textCharacter);
            Integer characterPosition = (position + key) - table.length();
            if ((position + key) < table.length()) {
                result += table.charAt(position + key);
            } else {
                result += table.charAt(characterPosition);
            }
        }

        return result;
    }

    public static String desencrypt(String text, int key) {
        cleanString(text);
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            Character textCharacter = text.charAt(i);
            int position = table.indexOf(textCharacter);
            Integer characterPosition = (position - key) + table.length();
            if ((position - key) < 0) {
                result += table.charAt(characterPosition);
            } else {
                result += table.charAt(position - key);
            }
        }

        return result;
    }

    private static void cleanString(String text) {
        /**
         * Takes a user text and clean the breaklines and
         * @param text a user gived String text
         * @return a String cleaned
         */
        text = text.toLowerCase();
        text = text.replaceAll("\n", "");
        for (int i = 0; i < text.length(); i++) {
            int position = table.indexOf(text.charAt(i));
            if (position == -1) text.replace(text.charAt(i), ' ');
        }
    }
}
