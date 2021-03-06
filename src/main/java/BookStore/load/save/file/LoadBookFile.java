package BookStore.load.save.file;

import BookStore.BookList;
import BookStore.Book;
import java.io.*;
import java.util.List;

import static java.lang.Integer.*;

public class LoadBookFile {


   public static List<BookStore.Book> loadFile() throws FileNotFoundException {
        String path = "E:/JAVA/Programowanie2/src/main/resources" +
                "/books2.csv";
        File bookListFile = new File(path);

        try (BufferedReader br = new BufferedReader(new FileReader(bookListFile))) {

            String linia = br.readLine();
            while (linia != null) {

                String[] slowo = linia.split(";");
                Book ksiazka = new Book(slowo[1], parseInt(slowo[3]), Long.parseLong(slowo[2]) );
                BookList.getBookList().add(ksiazka);
                linia = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Nie znaleziono książki");
        }
        return BookList.getBookList();
    }
}