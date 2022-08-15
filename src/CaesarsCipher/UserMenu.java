package CaesarsCipher;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserMenu {


    public static void southMenu() throws IOException {
        while (true) {
            Worktofile worktofile = new Worktofile();
            System.out.println("Вас приветствует программа Шифр Цезаря");
            System.out.println("Если ходите ввести текст для шифрования введите цифру 1");
            System.out.println("Если ходите ввести текст для дишифровки введите цифру 2");
            System.out.println("Если хотите прочитать инструкцию по пользованию программой введите 3");
            System.out.println("Для завершения программы введите 4");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Введите ключ шифрования");
                worktofile.caecarsUserText(sc.nextInt());
                return;
            } else if (x == 2) {
                System.out.println("Введите ключ дешифровки");
                worktofile.caecarsUserText(sc.nextInt());
                return;
            } else if (x == 3) {
                System.out.println("____________________________________________________________________________"+"\n"+"Программа работает очень легко: перед тем как зашифровать текст, необходимо ввести ключ, " + "\n"+
                        "который должен знать тот, кто будет этот текст расшифровывать;)."+ "\n"+ "Расшифровка в обратном порядке"+ "\n"+
                        "____________________________________________________________________________");
            } else if (x == 4) {
                break;
            }
        }
    }
}



