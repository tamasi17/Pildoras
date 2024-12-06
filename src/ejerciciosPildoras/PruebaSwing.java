package ejerciciosPildoras;

import javax.swing.*;

public class PruebaSwing {
    public static void main(String[] args) {
        JButton boton = new JButton("Haz clic aquí");
        JFrame ventana = new JFrame("Mi Ventana");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(boton);
        ventana.setVisible(true);
    }
}