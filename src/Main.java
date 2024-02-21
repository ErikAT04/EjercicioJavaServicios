import Modelo.RevisionAlarma;
import Modelo.TrabajoPintura;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TrabajoPintura pintura1 = new TrabajoPintura("Paco", LocalDate.now(), "Luis", 49, 15);
        JOptionPane.showMessageDialog(null, pintura1.detalleServicio());
        RevisionAlarma alarma1 = new RevisionAlarma(LocalDate.now(), "Paco", 5);
        JOptionPane.showMessageDialog(null, alarma1.detalleServicio());
    }
}