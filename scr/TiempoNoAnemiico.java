import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class TiempoNoAnemiico {
    private LocalDate fecha;

    public TiempoNoAnemiico(){
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }
public String formatoLargo(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy",
                new Locale("es","ES"));
        return fecha.format(formato);
}

public String formatoCorto(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es","ES"));
        return fecha.format(formato);
}
}
//Es este caso el no anemico tiene en el objeto tiempo tanto los datos como la logica almacenada
// el main se encarga de pedir el formato para mostrar la fecha