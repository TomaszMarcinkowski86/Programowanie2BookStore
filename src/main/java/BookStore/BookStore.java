package BookStore;

import java.io.*;
import java.util.List;
import java.util.Scanner;


public class BookStore {


    public static void main(String[] args) throws IOException {


        System.out.println("1. Wyświetl listę książek");
        System.out.println("2. Dodaj książkę");
        System.out.println("3. Usuń książekę po nazwie");
        System.out.println("4. Edytuj rok wydania");
        System.out.println("5. Zapisz listę książek do pliku csv");
        System.out.println("6. Wyjdź");


        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = LoadFile.loadFile();

        int choose;
        do {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Lista dostępnych książek");
                    System.out.println(bookList);
                    break;
                case 2:
                    System.out.println("Dodaj książkę");
                    break;
                case 3:
                    System.out.println("Usuń");
                    break;
                case 4:
                    System.out.println("Edytuj rok wydania");
                    break;
                case 5:
                    System.out.println("Zapisz listę do pliku");
                    break;
                case 6:
                    System.out.println("Zapraszamy ponownie");
                    break;
                default:
                    System.out.println("Wybrałeś nieprawidłową komendę");
            }
        } while (choose != 6);

    }

}