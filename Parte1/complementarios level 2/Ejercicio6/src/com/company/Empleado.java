package com.company;

import java.util.Objects;

public class Empleado {
     private String Nombre_apellido;
    private int dni;
    private int horaTrabajadas;
    private int valorPorHora;
    private int sueldo;

    public Empleado(String nombre_apellido, int dni, int horaTrabajadas, int valorPorHora) {
        Nombre_apellido = nombre_apellido;
        this.dni = dni;
        this.horaTrabajadas = horaTrabajadas;
        this.valorPorHora = valorPorHora;
        this.sueldo = this.horaTrabajadas * this.valorPorHora;
    }


    public String getNombre_apellido() {
        return Nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        Nombre_apellido = nombre_apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHoraTrabajadas() {
        return horaTrabajadas;
    }

    public void setHoraTrabajadas(int horaTrabajadas) {
        this.horaTrabajadas = horaTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return dni == empleado.dni &&
                Nombre_apellido.equals(empleado.Nombre_apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre_apellido='" + Nombre_apellido + '\'' +
                ", dni=" + dni +
                ", horaTrabajadas=" + horaTrabajadas +
                ", valorPorHora=" + valorPorHora + "sueldo: "+sueldo+
                '}';
    }
}
