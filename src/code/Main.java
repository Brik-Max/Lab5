package code;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\Maksim Brikun\\Desktop\\inf.txt")){
            Scanner scan = new Scanner(reader); //связываем поток чтения со сканером
            while(scan.hasNextLine()){ //проверям существует ли что-то в файле
                System.out.println(scan.nextLine());//выводим в консоль
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}