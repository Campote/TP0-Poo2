public class MainNoAnemico {
    public static void main (String[] args){
        TiempoNoAnemiico tiempo = new TiempoNoAnemiico();
        System.out.println("Formato Largo: "+ tiempo.formatoLargo());
        System.out.println("Formato Corto" + tiempo.formatoCorto());
    }
}
//Es este caso el no anemico tiene en el objeto tiempo tanto los datos como la logica almacenada
// el main se encarga de pedir el formato para mostrar la fecha