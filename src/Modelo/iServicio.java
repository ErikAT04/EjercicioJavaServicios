package Modelo;

import java.time.LocalDate;

public interface iServicio {
    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
}
