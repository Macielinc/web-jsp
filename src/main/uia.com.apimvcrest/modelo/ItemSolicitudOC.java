package uia.com.apimvcrest.modelo;

public class ItemSolicitudOC extends ItemComprasUIAModelo {

    private int vendedor=-1;

    public  ItemSolicitudOC(int vendedor){
        this.vendedor = vendedor;
    }
    public  ItemSolicitudOC(int vendedor, String name, int clasificacion, int id, String codigo){
        super(id, name, "", -1, clasificacion, -1, -1, "",codigo);
        this.vendedor = vendedor;
    }

    @Override
    public int getVendedor() {
        return vendedor;
    }

    @Override
    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public void print() {
        System.out.println(
                " \n\t\tvendedor:\t" + this.vendedor);
    }
}
