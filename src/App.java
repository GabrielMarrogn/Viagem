import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pessoas = 0;
        int carro = 0;

        while (true) {
            String a = br.readLine();
            if (a.equals("ABEND")) {
                break;
            }
            String[] arr = a.split(" ");
            String palavra = arr[0];
            int numero = Integer.parseInt(arr[1]);

            if (palavra.equals("SALIDA")) {
                pessoas += numero;
                carro++;
            } else if (palavra.equals("VUELTA")) {
                pessoas -= numero;
                carro--;
            }

        }

        System.out.println(pessoas);
        System.out.println(carro);

    }
}
