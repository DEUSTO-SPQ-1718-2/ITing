package com.example.usuario.integrationmaps;

import java.util.ArrayList;

/**
 * Created by Usuario on 18/10/2017.
 */

public class mesa {

    public String id, nombre, restaurante;
    public int comensales;
    public ArrayList<Integer> vinculadas;
    boolean ocupado;
    boolean seleccionado;

    public mesa(String id, String nombre,  String comensales, String ocupado, String vinculadas, String restaurante) {
        this.id = id;
        this.nombre = nombre;
        this.comensales = Integer.parseInt(comensales);
        this.vinculadas = new ArrayList<>();
        String string = vinculadas;
        String[] parts = string.split(",");
        for(int i = 0; i<parts.length;i++){
            if(parts[i].equals("")){
                this.vinculadas.add(Integer.parseInt("123"));
            }else {
                this.vinculadas.add(Integer.parseInt(parts[i]));
            }
        }
        System.out.print("**************"+ocupado);
        if(ocupado.equals("0")){
            this.ocupado= false;
        }else{
            this.ocupado = true;
        }
        this.restaurante = restaurante;
        this.seleccionado = false;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public ArrayList<Integer> getVinculadas() {
        return vinculadas;
    }

    public void setVinculadas(ArrayList<Integer> vinculadas) {
        this.vinculadas = vinculadas;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
