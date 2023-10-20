package com.example.mascotas;

public class NivelAccesoEjemplo {
    //Las clases solo pueden tener dos tipos de acceso
    // public o default

    public String nombre="Luis Rojas";
    protected String telefono="3143568974";
    private String direccion="Calle 45 # 55-47";
    String nacionalidad="Colombiana";

    private void saludar(){
        System.out.println("Hola private");
        direccion.length();
    }

    protected void saludar2(){
        System.out.println("Hola protected");
    }

    void saludar3(){
        System.out.println("Hola default");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
