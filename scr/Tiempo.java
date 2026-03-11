import java.time.LocalDate;
public class Tiempo {
 private LocalDate Fecha;
 public Tiempo(){
     this.Fecha = LocalDate.now();
 }

    public LocalDate getFecha() {
        return Fecha;
    }
}
