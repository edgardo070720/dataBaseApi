package com.example.dataBaseApi.domain;

import java.util.List;

public class Oracle implements IDataBase{

    @Override
    public void insertarRegistro(Producto producto) {

    }

    @Override
    public List<Producto> consultarRegistro() {
        return List.of();
    }


    @Override
    public void actualizarRegistro(Producto producto) {

    }

    @Override
    public void eliminarRegistro(Producto producto) {

    }

    @Override
    public Producto consultarRegistroId(String id) {
        return null;
    }
}
