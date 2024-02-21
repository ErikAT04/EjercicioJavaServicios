package Modelo;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    int alarmasRevisar;

    public RevisionAlarma(LocalDate fechainicio, String cliente, int alarmasRevisar) {
        super(fechainicio, cliente);
        this.alarmasRevisar = alarmasRevisar;
        super.trabajador="Revisor Especialista Contraincendios";
    }

    public int getAlarmasRevisar() {
        return alarmasRevisar;
    }

    public void setAlarmasRevisar(int alarmasRevisar) {
        this.alarmasRevisar = alarmasRevisar;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return ((double) alarmasRevisar /3)*40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return String.format("REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n"+
                "Cliente: " + cliente + "\n"+
                "Fecha de revisión: " + fechainicio + "\n"+
                "----------------------------------------\n"+
                "Total: %.2f \n"+
                "----------------------------------------", costeTotal());
    }
}
