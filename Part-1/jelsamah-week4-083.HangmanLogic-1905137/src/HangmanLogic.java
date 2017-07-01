
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private int counter;
    private char tempChar;
    private String tempString;
    private String hiddenWord = "";

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
        } else {
            if (this.word.contains(letter)) {
                this.guessedLetters = this.guessedLetters.concat(letter);
            } else {
                this.guessedLetters = this.guessedLetters.concat(letter);
                this.numberOfFaults++;
            }
        }

    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        this.counter = 0;
        while (this.counter < this.word.length()) {
            tempChar = this.word.charAt(this.counter);
            tempString = "" + tempChar;
            if (this.guessedLetters.contains(tempString)) {
                this.hiddenWord = this.hiddenWord.concat(tempString);
            }else{
                this.hiddenWord = this.hiddenWord.concat("_");
            }
            this.counter++;
        }

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        return this.hiddenWord;
    }
}
