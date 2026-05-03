import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int castka = scanner.nextInt();
    int[] platidla = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    for (int p : platidla) while (castka >= p) {
        System.out.print(p + " ");
        castka -= p;
    }
}