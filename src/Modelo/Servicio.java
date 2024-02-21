package Modelo;

import java.time.LocalDate;

public abstract class Servicio implements iServicio{
    String trabajador;
    LocalDate fechainicio;
    String cliente;

    public Servicio(String trabajador, LocalDate fechainicio, String cliente) {
        this.trabajador = trabajador;
        this.fechainicio = fechainicio;
        this.cliente = cliente;
    }
    public Servicio(LocalDate fechainicio, String cliente) {
        this.fechainicio = fechainicio;
        this.cliente = cliente;
    }
    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
}
