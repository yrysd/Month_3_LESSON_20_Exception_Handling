
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Song song = new Song("Ysyk-kol","A.Osmonov","Иссык-Куль то замрет, то ударит волной\n" +
                "\n" +
                "И обрушит на берег огонь молодой\n" +
                "\n" +
                "Сколько в жизни своей ни имел я друзей,\n" +
                "\n" +
                "Все же друга верней не нашел под луной.\n" +
                "\n" +
                "Иссык-Куль, споря с мощью родимой земли,\n" +
                "\n" +
                "Ходит взад и вперед, и вблизи, и вдали\n" +
                "\n" +
                "Мечет пламень седой, сизый дым голубой,\n" +
                "\n" +
                "Полыхает прибой, словно воду зажгли.");


        try(FileReader fileReader = new FileReader("Text.txt")){
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.err.println("NO such file!!");
        }

        fileWriter(song);
    }

    private static void fileWriter(Song song) {
        try(FileWriter fileWriter = new FileWriter("Text.txt")){
            fileWriter.write(song.getTitle());
            fileWriter.write(song.getAuthor());
            fileWriter.write(song.getText());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
