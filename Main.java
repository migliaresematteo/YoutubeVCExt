import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Inserisci l'URL di un video YouTube: ");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        System.out.printf(elaborate(url));
    }
    public static String elaborate(String url) {
        return url.contains("https://www.youtube.com/watch?") ? "Codice estratto: " + url.substring(url.lastIndexOf(("v=")) + 2, url.lastIndexOf("v=") + 13) : "URL non valido";
    }
}
