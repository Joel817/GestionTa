/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionPKgui;

public class tareas {

   private String Titulo;
   private String Descripcion;
   private String FechaVen;
   private String Estados;

    public tareas(String Titulo, String Descripcion, String FechaVen, String Estados) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.FechaVen = FechaVen;
        this.Estados = Estados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaVen() {
        return FechaVen;
    }

    public void setFechaVen(String FechaVen) {
        this.FechaVen = FechaVen;
    }

    public String getEstados() {
        return Estados;
    }

    public void setEstados(String Estados) {
        this.Estados = Estados;
    }
   
   
}







