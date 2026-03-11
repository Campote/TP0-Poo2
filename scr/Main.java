import javax.swing.text.DateFormatter;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
      Tiempo tiempo = new Tiempo();
      DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern(
              "EEEE d 'de' MMMM 'de' yyyy", new Locale("es","ES")
      );
      DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      System.out.println("Formato Largo: " + tiempo.getFecha().format(formatoLargo));
      System.out.println("Formato Corto: "+ tiempo.getFecha().format(formatoCorto));

        // Implementacion Anemica porque el objeto tiempo tiene nada mas que los datos (es decir la fecha) y no contiene sus comportamiento
        // la logica esta en el main con lo cual esto lleva a que no hay encapsulamiento en el objeto

    }
}
