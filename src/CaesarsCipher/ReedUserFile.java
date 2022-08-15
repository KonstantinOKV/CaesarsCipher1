package CaesarsCipher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReedUserFile {

    public String userText;

    private String readTXTFile(String path) { //Read txt file
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

    public void readFileUser() { //Read user file
        userText = readTXTFile("resources/" + "text.txt");
        if (userText == null) {
            System.out.println("Ошибка файл пустой");
            return;
        }
    }
}





