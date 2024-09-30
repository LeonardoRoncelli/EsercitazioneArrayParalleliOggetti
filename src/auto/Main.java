package auto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Auto a1=new Auto();
        System.out.print("Inserisci la marca della prima auto ");
        a1.setMarca(input.nextLine());
        System.out.print("Inserisci il modello della prima auto ");
        a1.setModello(input.nextLine());
        System.out.print("Inserisci il prezzo della prima auto ");
        a1.setPrezzo(input.nextDouble());
        System.out.println();
        Auto a2=new Auto();
        System.out.print("Inserisci la marca della seconda auto ");
        a2.setMarca(input.next());
        System.out.print("Inserisci il modello della seconda auto ");
        a2.setModello(input.next());
        System.out.print("Inserisci il prezzo della seconda auto ");
        a2.setPrezzo(input.nextDouble());
        System.out.println();
        Auto a3=new Auto();
        System.out.print("Inserisci la marca della terza auto ");
        a3.setMarca(input.next());
        System.out.print("Inserisci il modello della terza auto ");
        a3.setModello(input.next());
        System.out.print("Inserisci il prezzo della terza auto ");
        a3.setPrezzo(input.nextDouble());
        Auto a4=new Auto();
        System.out.println();
        System.out.print("Inserisci la marca della quarta auto ");
        a4.setMarca(input.next());
        System.out.print("Inserisci il modello della quarta auto ");
        a4.setModello(input.next());
        System.out.print("Inserisci il prezzo della quarta auto ");
        a4.setPrezzo(input.nextDouble());
        System.out.println();
        System.out.println();
        System.out.println("Auto 1: "+a1.getMarca()+", "+a1.getModello()+", "+"€ "+a1.getPrezzo());
        System.out.println("Auto 2: "+a2.getMarca()+", "+a2.getModello()+", "+"€ "+a2.getPrezzo());
        System.out.println("Auto 3: "+a3.getMarca()+", "+a3.getModello()+", "+"€ "+a3.getPrezzo());
        System.out.println("Auto 4: "+a4.getMarca()+", "+a4.getModello()+", "+"€ "+a4.getPrezzo());
    }
}