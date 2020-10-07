import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
[ Brasil ] – 08/10/2015
[ EUA ] – 10 / 8 / 2020
[ Alemanha ] – 08.10.2020
*/


public class Main {
     public static void main(String[] args) {
     
     Scanner input = new Scanner (System.in); 

     int year, month, dayOfMonth;

     System.out.println ("Informe o dia: ");
     dayOfMonth = input.nextInt();
     
     System.out.println ("Informe o mes: ");
     month = input.nextInt();
     
     System.out.println ("Informe o ano: ");
     year = input.nextInt();

     LocalDate data = LocalDate.of(year, month, dayOfMonth);
     
     DateTimeFormatter formatadorBrazil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     DateTimeFormatter formatadorEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
     DateTimeFormatter formatadorAlemanha = DateTimeFormatter.ofPattern("dd.MM.yyyy");

     System.out.println("Data Brazil: " + data.format(formatadorBrazil));
     System.out.println("Data EUA: " + data.format(formatadorEUA));
     System.out.println("Data Alemanha: " + data.format(formatadorAlemanha));

}
}
