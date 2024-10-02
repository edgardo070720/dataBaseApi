package com.example.dataBaseApi.domain;

import java.util.List;

public class Oracle implements IDataBase{
    private List<Producto> productos;

    public Oracle(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public void insertarRegistro(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> consultarRegistro() {
        return productos;
    }


    @Override
    public void actualizarRegistro(Producto producto) {
        Producto _producto=consultarRegistroId(producto.getId());
        eliminarRegistro(_producto);
        insertarRegistro(producto);
    }

    @Override
    public void eliminarRegistro(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public Producto consultarRegistroId(String id) {
        for(Producto producto:productos){
            if (producto.getId().equals(id)){
                return producto;
            }
        }
        return null;
    }
}
