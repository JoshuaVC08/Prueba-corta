import java.util.ArrayList;

public class ContenedorDeProductos {

    private String nombreDelSuper;


    private String telefDelSuper;
    private ArrayList<Producto> productos;


    //CONSTRUCTOR

    public ContenedorDeProductos(){
        this.productos = new ArrayList<>();
        this.nombreDelSuper = "";
        this.telefDelSuper = "";
    }







    public ContenedorDeProductos(String nombreDelSuper, String telefDelSuper) {
        this.nombreDelSuper = nombreDelSuper;
        this.telefDelSuper = telefDelSuper;
        this.productos = new ArrayList<>();
    }



        //GETTER Y SETTER

        public String getNombreDelSuper() {

            return nombreDelSuper;

        }

        public void setNombreDelSuper(String nombreDelSuper) {

            this.nombreDelSuper = nombreDelSuper;

        }

        public String getTelefDelSuper() {

            return telefDelSuper;

        }

        public void setTelefDelSuper(String telefDelSuper) {

            this.telefDelSuper = telefDelSuper;

        }

        public ArrayList<Producto> getProductos() {

            return productos;
        }

        //INSERTAR PRODUCTOS

            public void insertarProducto(Producto producto) {

                for (Producto p: productos) {
                    if (p.getCodigo().equals(producto.getCodigo())) {
                            System.out.println("El producto con código" + producto.getCodigo() + "ya existe.");
                            return;}
                    productos.add(producto);}
                    }

    public String toString(){
        return "ContenedorDeProductos [nombDelSuper=" + nombreDelSuper + ", telefDelSuper=" + telefDelSuper +", productos=" + productos + "]";
    }

}
