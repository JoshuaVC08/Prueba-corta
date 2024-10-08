public class Main {
    public static void main(String[] args) {
        // CREAR PERIODO

        Periodo periodo1 = new Periodo("2023-01-01", "2023-12-31");

        IVA iva1 = new IVA(19.0f,periodo1);

        Expira expira1 = new Expira("2025-06-30");

        //CREAR PRODUCTOS
        Producto producto1 = new Producto("001", "Arroz", 100,2000.0,10.0,expira1,iva1);
        Producto producto2 = new Producto("002","Frijoles",50,3000.0,15.0,expira1,iva1);
        Producto productoDuplicado = new Producto("001", "Arroz Duplicado", 30, 2500.0, 12.0, expira1, iva1);

        //CREAR CONTENEDOR
        ContenedorDeProductos supermercado = new ContenedorDeProductos("SuperMercado ABC","123456789");

        //INSERTAR PRODUCTOS
        supermercado.insertarProducto(producto1);
        supermercado.insertarProducto(producto2);
        supermercado.insertarProducto(productoDuplicado);

        //IMPRIMIR DETALLES

        System.out.println(supermercado);
    }
}
