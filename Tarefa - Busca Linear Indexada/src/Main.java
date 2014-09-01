import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner csv = new Scanner(new BufferedReader(new FileReader("arquivo.csv")));
		
		System.out.println(csv.nextLine());
		
		String [] vet = csv.nextLine().split("#");
		
		for (int i = 0 ; i < 3 ; i++) {
			System.out.println(vet[i]);
		}
	}
}
