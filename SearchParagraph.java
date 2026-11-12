public class SearchParagraph {
    public static void main(String[] args) {
        String[] paragraphs = new String[10];
        paragraphs[0]="Lose all the weight you want.";
        paragraphs[1]="I can't I must work";
        paragraphs[2]="That would be like a keyword search.";
        paragraphs[3]="This would be Victoria.";
        paragraphs[4]="Join the party.";
        paragraphs[5]="To be or not to be.";
        paragraphs[6]="That is a question to test keyword search.";
        paragraphs[7]="Can you find a needle in a hay stack?";
        paragraphs[8]="This could be the last paragraph, but its not.";
        paragraphs[9]="Ada Lovelace is the worlds first programmer as of 1860.";

        String searchKey = "keyword search";
        boolean found = false;

        System.out.println("Search for: " + searchKey);
        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(searchKey)) {
                System.out.println("Found at index " + i);
                System.out.println("Content: " + paragraphs[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Phrase not found.");
        }
    }
}