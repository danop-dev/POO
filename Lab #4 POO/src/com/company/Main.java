package com.company;
import java.util.*;


class Manipulator_Info{

    private static boolean isPuncMarks(char ch){
        return ch == '.' || ch == '?' || ch == '!';
    }
    private static boolean isLetter(char ch){
        return (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90);
    }
    private static boolean isVowels(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // _Basic Level_
    public static int numSentences(String str){
        int count = 0;
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isPuncMarks(c)){
                count++;
            }
        }
        return count;
    }

    public static int numWords(String str){
        int count = 0;
        str = str.replaceAll("\\( \\) \\[ \\] \\{ \\}","");
        char[] str_char = str.toCharArray();

        for(char c : str_char) {
            if (c == ' ' || isPuncMarks(c)) {
                count++;
            }
        }
        return count;
    }

    //  _Advanced Level_ :1
    public static int numLetters(String str){
        int count = 0;
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isLetter(c)){
                count++;
            }
        }
        return count;
    }

    public static int numVowels(String str){
        int count = 0;
        str = str.toLowerCase();
        char[] str_char = str.toCharArray();

        for(char c : str_char){
            if(isVowels(c)){
                count++;
            }
        }
        return count;
    }

    public static int numConsonants(String str){
        int count = 0;
        str = str.toLowerCase();
        char[] chars = str.toCharArray();

        for(char c : chars){
            if( isLetter(c) && !isVowels(c)){
                count++;
            }
        }
        return count;

    }

    //_Advanced Level_ : 2
    public static void topFiveWords(String str){
        int max = 0;
        String word = null;
        str = str.toLowerCase();
        str = str.replaceAll("[.,?!]","");
        String[] tok = str.split(" ");
        List<String> tok_li = new ArrayList<>(Arrays.asList(tok));


        System.out.println("\n ## Top 5 Words: ##\n");
        for( int i = 0 ; i < 5 ; i++ ) {
            for (int j = 0; j < tok_li.size(); j++) {
                int numCollWord = Collections.frequency(tok_li, tok[j]);
                if(numCollWord > max){
                    max = numCollWord;
                    word = tok[j];
                }
                if(j == tok_li.size() - 1){
                    System.out.println((i+1) + ". " + word + " : " + max + " time(s)");
                    tok_li.removeAll(Collections.singleton(word));
                    max = 0;
                }
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        String str = "Machine learning (ML) is the study of computer algorithms that can improve automatically through experience and by the use of data. It is seen as a part of artificial intelligence. Machine learning algorithms build a model based on sample data, known as \"training data\", in order to make predictions or decisions without being explicitly programmed to do so. Machine learning algorithms are used in a wide variety of applications, such as in medicine, email filtering, speech recognition, and computer vision, where it is difficult or unfeasible to develop conventional algorithms to perform the needed tasks.";

        System.out.println("Num. Sentences: " + Manipulator_Info.numSentences(str));
        System.out.println("Num. Words: " + Manipulator_Info.numWords(str));
        System.out.println("Num. Letters: " + Manipulator_Info.numLetters(str));
        System.out.println("Num. Vowels: " + Manipulator_Info.numVowels(str));
        System.out.println("Num. Consonants: " + Manipulator_Info.numConsonants(str));
        Manipulator_Info.topFiveWords(str);
    }
}
