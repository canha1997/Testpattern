package Testpattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        Pattern p = Pattern.compile("[A-Z]{4}\\d{2}");
        System.out.println("moi ban nhap choi String");
        String match= scanner.nextLine().trim();
        Matcher matcher=p.matcher(match);
        System.out.println(matcher.matches());
//        while (!matcher.matches())
//        {
//            System.out.println("Moi ban nhap lai");
//            match= scanner.nextLine().trim();
//        }

    }
}
