public class ReverseWordLetters {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            char[] charArr = word.toCharArray();
            int left = 0;
            int right = charArr.length - 1;
            while (left < right) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
            String reversedWord = new String(charArr);
            result = result + reversedWord + " ";
        }

        result = result.trim();
        System.out.println(result);
    }
}