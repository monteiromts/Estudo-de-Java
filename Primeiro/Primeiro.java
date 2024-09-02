public class Primeiro {

    public static void main(String[] args) {
        System.out.println("foi?");

    String nome = "Matheus";
    int idade = 23;
    double presente = 1000.0;
    System.out.printf("%s tem %d anos e ganhou  R$%.2f de bônus" , nome, idade, presente);

    double x = 20.123;
    System.out.printf("%.2f%n", x);
    System.out.println("Resultado = " + x +  " Km/h");
/////////////////////////////////////////////////////////////////
    String product1 = "Computer";
    String product2 = "office desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.00;
    double price2 = 650.50;
    double price3 = 53.234567;

    System.out.println("product:");
    System.out.printf("%s,whick price is $ %.2f",product1,price1);
    System.out.printf("\n%s,whick price is $ %.2f",product2,price2);
        System.out.println();
        System.out.println();
    System.out.printf("Record: %d years old, code %d and gender: %s",age,code,gender);
        System.out.println();
        System.out.println();
    System.out.printf("Measue with eight decimal places: %.8f",price3);
    System.out.printf("\nRouded (three decimal places): %.3f",price3);
    System.out.printf("\n US decimal point: %.3f", price3);


    }
}
