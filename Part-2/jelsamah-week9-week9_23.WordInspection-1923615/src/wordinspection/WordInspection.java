package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private List<String> words = new ArrayList<String>();

    public WordInspection(File file) throws Exception {
        Scanner reader = new Scanner(file, "UTF-8");
        while (reader.hasNext()) {
            words.add(reader.next());

        }
    }

    public int wordCount() {
        int i = 0;
        for (String word : words) {
            i++; 
        }
        return i;
    }

    public List<String> wordsContainingZ() {
        List<String> wordsWithZ = new ArrayList<String>();
        for (String word : words) {
            if (word.contains("z")) {
                wordsWithZ.add(word);
            }
        }
        return wordsWithZ;
    }
    
    public List<String> wordsEndingInL() {
        List<String> wordsEndL = new ArrayList<String>();
        for (String word : words) {
            if (word.endsWith("l")) {
                wordsEndL.add(word);
            }
        }
        return wordsEndL;
    }
    
    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word : words) {
            if (word.trim().equals(reverse(word))) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }
     
    public static String reverse(String word){
        String reversedWord = "";
        char[] array = word.trim().toCharArray();
        char temp;
        int beginning;
        int end = word.length()-1;
        for(beginning = 0; beginning < end; beginning++, end--){
            temp = array[beginning];
            array[beginning] = array[end];
            array[end] = temp;
        }
        for(char character : array){
            reversedWord += character;
        }
        return reversedWord;
        
    }
    
    public List<String> wordsWhichContainAllVowels(){
        List<String> wordsVowels = new ArrayList<String>();
        for (String word : words) {
            if (hasVowels(word)) {
                wordsVowels.add(word);
            }
        }
        return wordsVowels;
    }

    public static boolean hasVowels(String word){
        String vowels = "aeiouyäö";
        char[] vowelsChar = vowels.toCharArray();
        for(char character : vowelsChar){
            if(!word.contains(character + "")){
                return false;
            }
        }
        
        return true;
    }
    
}
