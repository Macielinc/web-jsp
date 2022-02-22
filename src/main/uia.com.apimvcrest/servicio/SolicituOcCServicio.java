package uia.com.apimvcrest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.modelo.SolicitudOcModelo;
import uia.com.apimvcrest.compras.GestorCompras;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolicituOcCServicio implements ISolicituOcCServicio {

    GestorCompras miGestorCompras;

    public  SolicituOcCServicio() throws IOException{

    }

    @Autowired
    public  SolicituOcCServicio(GestorCompras gestorCompras) throws IOException{
        this.miGestorCompras = gestorCompras;
    }

    public ArrayList<SolicitudOcModelo> getSolicitudOC() {

        return miGestorCompras.getSolicitudOC();
    }


    @Override
    public SolicitudOcModelo getSolicitudOC (int id) {
        return miGestorCompras.getSolicitudOC(id);
    }

    @Override
    public void print() {
        miGestorCompras.printMiModeloSolicitudes();
    }

    @Override
    public SolicitudOcModelo deleteSolicitud(int id) {

        return miGestorCompras.deleteSolicitudOC(id);
    }

    @Override
    public SolicitudOcModelo putSolicitud(int id, ItemComprasUIAModelo newItem) {
        return miGestorCompras.putSolicitud(id, newItem);
    }
}
