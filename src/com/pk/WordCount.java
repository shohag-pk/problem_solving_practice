package com.pk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    static Map<String, Long> countWord(List<String> words){
        Map<String, Long> newWordMap = new HashMap<>();
        for(String word : words){
            if(!newWordMap.containsKey(word)){
                newWordMap.put(word,0L);
            }

            Long oldCount = newWordMap.get(word);
            newWordMap.put(word,oldCount+1);
        }
        return newWordMap;

        /*for(String word : words){
            newWordMap.merge(word,1L,(value, oldValue) ->  value + oldValue);
        }

        return newWordMap;*/

       // return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    public static void main(String[] args) {
        List<String> someWords = Arrays.asList("shohag","sabbir","shohel", "shohag","shohag","shohel");
        Map<String, Long> stringLongMap = countWord(someWords);
        System.out.println(stringLongMap);
    }
}
