package Modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    double superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechainicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechainicio, cliente);
        this.superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (superficie/7.8)*PrecioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie/10)*9.5;
    }

    @Override
    public double costeTotal() {
        double costeTotal = costeManoObra() + costeMaterial();
        if (superficie<50){
            return costeTotal*1.15;
        } else {
            return costeTotal;
        }
    }

    @Override
    public String detalleServicio() {
        return String.format("TRABAJO DE PINTURA\n" +
                "Cliente: " + cliente + "\n" +
                "Fecha de inicio: " + fechainicio + "\n" +
                "----------------------------------------\n" +
                "Pintor " + trabajador + "\n" +
                "Coste Material..... " + "%.2f" + "\n" +
                "Coste Mano Obra.... " + "%.2f" + "\n" +
                "Coste Adicional.... " + "%.2f" + "\n"+
                "TOTAL: " + costeTotal()+ "\n" +
                "----------------------------------------", costeMaterial(), costeManoObra(), ((superficie>50) ? 0 : costeTotal()*0.15));
    }
}
