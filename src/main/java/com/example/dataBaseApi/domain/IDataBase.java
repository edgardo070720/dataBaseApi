package com.example.dataBaseApi.domain;

import java.util.List;

public interface IDataBase {
     void insertarRegistro(Producto producto);
     List<Producto> consultarRegistro();
     void actualizarRegistro(Producto producto);
     void eliminarRegistro(Producto producto);
    Producto consultarRegistroId(String id);
}
