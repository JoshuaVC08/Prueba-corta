import java.util.ArrayList;

public class ContenedorDeProductos {

    private String nombreDelSuper;
    private String telefDelSuper;
    private ArrayList<Producto> productos;

    // Constructor
    public ContenedorDeProductos() {
        this.productos = new ArrayList<>();
        this.nombreDelSuper = "";
        this.telefDelSuper = "";
    }

    public ContenedorDeProductos(String nombreDelSuper, String telefDelSuper) {
        this.nombreDelSuper = nombreDelSuper;
        this.telefDelSuper = telefDelSuper;
        this.productos = new ArrayList<>();
    }

    // Getters y Setters
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

    // Insertar productos
    public void insertarProducto(Producto producto) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(producto.getCodigo())) {
                System.out.println("El producto con código " + producto.getCodigo() + " ya existe.");
                return;
            }
        }
        productos.add(producto);
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supermercado: ").append(nombreDelSuper)
            .append("\nTeléfono: ").append(telefDelSuper)
            .append("\nProductos:\n");
        for (Producto producto : productos) {
            sb.append(producto).append("\n");
        }
        return sb.toString();
    }
}
