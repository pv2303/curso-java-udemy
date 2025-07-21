// SEÇÃO 4 - ESTRUTURAS SEQUENCIAIS
// Vídeo 24 - Ex1
// Inicie com as seguintes variáveis:
// duas strings, "Computer" e "Office desk"
// duas ints, idade 30 e code 5290
// um char gender, F
// três doubles, preço 1, preço 2 e mensuração com os valores 2100.0, 650.50 e 53.234567
// Reproduza a saída que o Vídeo pede a partir dessas variáveis
import java.util.Locale;

public class Sec4_ex1 {
    public static void main(String[] args) {
        String p1 = "Computer";
        String p2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Product%n%s, which price is $ %.2f.%n%s, which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasure with eight decimal places: %f%nRounded (three decimal places): %.3f%n", p1, price1, p2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }
}
