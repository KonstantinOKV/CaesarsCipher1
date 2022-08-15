package CaesarsCipher;

import java.io.FileWriter;
import java.io.IOException;

public class Worktofile {
    public void caecarsUserText(int key) throws IOException {
        ReedUserFile reedUserFile = new ReedUserFile();
        CAlphabet CAlphabet = new CAlphabet();
        reedUserFile.readFileUser();

        String message = "";
        for (char character : reedUserFile.userText.toCharArray()) {
            int startIndex;
            if (character >= 'a' && character <= 'я') {
                startIndex = character - 'а';
                int shifted_index = (startIndex + key) % CAlphabet.alphabet.length;
                char ciphertext = (char) ('а' + shifted_index);
                message += ciphertext;
            } else if (character >= 'А' && character <= 'Я') {
                String letter = String.valueOf(character);
                String lowercase = letter.toLowerCase();
                char lowercaseLetter = lowercase.charAt(0);
                startIndex = lowercaseLetter - 'а';
                int shiftedIndex = (startIndex + key) % CAlphabet.alphabet.length;
                char ciphertext = (char) ('a' + shiftedIndex);
                String ciphertextUpper = String.valueOf(ciphertext);
                ciphertextUpper = ciphertextUpper.toUpperCase();
                message += ciphertextUpper;
            } else {
                message += character;

            }
            try {
                FileWriter resultFile = new FileWriter("resources/reed.txt");
                resultFile.write(message);
                resultFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(message);

   }
}



