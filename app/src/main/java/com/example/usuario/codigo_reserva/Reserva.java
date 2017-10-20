package com.example.usuario.codigo_reserva;

/**
 * Created by Usuario on 19/10/2017.
 */

public class Reserva {

    String id, codigo, id_mesa;

    public Reserva(String id, String codigo, String id_mesa) {
        this.id = id;
        this.codigo = codigo;
        this.id_mesa = id_mesa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(String id_mesa) {
        this.id_mesa = id_mesa;
    }
}
