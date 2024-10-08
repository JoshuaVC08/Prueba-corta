public class Expira {

    private String fechaExpiracion;


    //CONSTRUCTOR
    public Expira() {
        this.fechaExpiracion = "";
    }

    //CONSTRUCTOR SOBRECARGADO

    public Expira(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }


    //METODOS SET Y GET

    public String getFechaExpiracion() {

        return fechaExpiracion;

        }
    public void setFechaExpiracion(String fechaExpiracion) {

        this.fechaExpiracion = fechaExpiracion;

        }

    //METODO toString

    public String toString(){
        return "Expira [fechaExpiracion=" + fechaExpiracion + "]";
    }


}
