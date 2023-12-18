package LeetCode;

public class ArrayStringsAreEqual1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String wordAdd1 = "";
        String wordAdd2 = "";
        for (int i = 0; i < word1.length; i++) {
            wordAdd1 = wordAdd1 + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            wordAdd2 = wordAdd2 + word2[i];
        }

        System.out.println(wordAdd1);
        System.out.println(wordAdd2);

        if (wordAdd1.equals(wordAdd2)){
            return true;
        }
       return false;
    }

    public static void main(String[] args) {
        String word1[] = {"ac", "b"};
        String word2[] = {"ab", "c"};
        arrayStringsAreEqual(word1,word2);
    }
}
