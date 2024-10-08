public class Periodo{

    private String fechaInicio;
    private String fechaFin;





    //CONSTRUCTOR

    public Periodo(){
        this.fechaInicio = "";
        this.fechaFin = "";
    }


    //CONSTRUCTOR SOBRECARGADO

    public Periodo(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }



    // METODOS GET Y SET

    public String getFechaInicio() {
        return fechaInicio;
        }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
        }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }


        // METODO toString

    public String toString() {
        return "Periodo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";

    }

}