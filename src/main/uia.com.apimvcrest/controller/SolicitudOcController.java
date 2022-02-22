package uia.com.apimvcrest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.modelo.SolicitudOcModelo;
import uia.com.apimvcrest.servicio.SolicituOcCServicio;

import java.io.IOException;
import java.util.List;



@Controller
public class SolicitudOcController {

    private SolicituOcCServicio servicioOCSolicitud;

    @Autowired
    public SolicitudOcController(SolicituOcCServicio servicio) throws IOException{
        this.servicioOCSolicitud = servicio;
    }

    @GetMapping("/viewSolicitudes")
    public String viewSolicitudes(ModelMap model)
    {
        List<SolicitudOcModelo> solicitudes = servicioOCSolicitud.getSolicitudOC();
        System.out.println("Solicitudes: " + solicitudes.toString());
        model.addAttribute("solicitudes", servicioOCSolicitud.getSolicitudOC());
        return "view-solicitudes";
    }



    @GetMapping("/solicitud/{id}")
    public SolicitudOcModelo solicitudById(@PathVariable int id)
    {
        return  servicioOCSolicitud.getSolicitudOC(id);
    }

    @DeleteMapping("/solicitud/{id}")
    public SolicitudOcModelo deleteSolicitudById(@PathVariable int id)
    {
        return  servicioOCSolicitud.deleteSolicitud(id);
    }

    @PutMapping("/solicitud/{id}")
    public SolicitudOcModelo solicitudPutById(@PathVariable int id, @RequestBody ItemComprasUIAModelo newItem)
    {
        return  servicioOCSolicitud.putSolicitud(id, newItem);
    }

    public SolicituOcCServicio getServicioSolicitudes() {
        return servicioOCSolicitud;
    }

    public void setServicioCotizaciones(SolicituOcCServicio servicioOCSolicitud) {
        this.servicioOCSolicitud = servicioOCSolicitud;
    }
}
