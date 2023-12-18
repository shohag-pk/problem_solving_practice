package LeetCode;

public class MostWordsFound {
    public static int mostWordsFound(String[] sentences) {

        int maxWord = 0;
        int count = 1;
        for(int i=0; i<sentences.length; i++){
            for (int j = 0; j < sentences[i].length(); j++)
            {
                if ((sentences[i].charAt(j) == ' ') && (sentences[i].charAt(j + 1) != ' '))
                {
                    count++;
                }
            }

            int temp = count;
            count=1;

            if(maxWord <= temp){
                maxWord = temp;
            }
        }

        return maxWord;
    }

    public static void main(String[] args) {
        String sentence[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = mostWordsFound(sentence);
        System.out.println(result);
    }
}
