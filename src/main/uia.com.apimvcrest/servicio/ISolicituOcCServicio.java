package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.modelo.SolicitudOcModelo;

import java.util.ArrayList;

public interface ISolicituOcCServicio {
    ArrayList<SolicitudOcModelo> getSolicitudOC();
    Object getSolicitudOC(int id);
    void print();

    SolicitudOcModelo deleteSolicitud(int id);
    SolicitudOcModelo putSolicitud(int id, ItemComprasUIAModelo newItem);

}
