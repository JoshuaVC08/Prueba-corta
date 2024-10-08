public class Producto {

private String codigo;
private String nombre;
private int existencia;
private double precioBase;
private double porcentajeGanancia;
private Expira expira;
private IVA iva;


    //CONSTRUCTOR

    public Producto(){
        this.codigo = "";
        this.nombre = "";
        this.existencia = 0;
        this.precioBase = 0.0;
        this.porcentajeGanancia = 0.0;
        this.expira = new Expira();
        this.iva = new IVA();
    }

    //CONSTRUCTOR SOBRECARGADO

    public Producto(String codigo,String nombre, int existencia, double precioBase, double porcentajeGanancia, Expira expira, IVA iva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precioBase = precioBase;
        this.porcentajeGanancia = porcentajeGanancia;
        this.expira = expira;
        this.iva = iva;

    }

    //METODOS SET Y GET

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(double porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public Expira getExpira() {
        return expira;
    }

    public void setExpira(Expira expira) {
        this.expira = expira;
    }

    public IVA getIva() {
        return iva;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }

    //METODO toString

    public String toString(){

        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", existencia=" + existencia + ", precioBase=" + precioBase + ", porcentajeGanancia=" + porcentajeGanancia + ", expira=" + expira + ", iva=" + iva + "]";
    }

}
