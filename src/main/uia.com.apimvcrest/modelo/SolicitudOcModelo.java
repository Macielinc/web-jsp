package uia.com.apimvcrest.modelo;

import java.util.ArrayList;

public class SolicitudOcModelo {
    private int id=-1;
    private String name="";
    private String codigo="";


    private ArrayList<ItemSolicitudOC> items = new ArrayList<ItemSolicitudOC>();

    public ArrayList<ItemSolicitudOC> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemSolicitudOC> items) {
        this.items = items;
    }

    public SolicitudOcModelo(int id, String name, String codigo) {
        this.id=id;
        this.name = name;
        this.codigo = codigo;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public void print()
    {
        System.out.println(
                " \n\tid:\t"+this.id
                        +" \n\tname:\t"+this.name
                        +" \n\tcodigo:\t"+this.codigo);
        if(this.getItems() != null)
        {
            for(int i=0; i<this.getItems().size(); i++)
                this.getItems().get(i).print();
        }
    }

}
