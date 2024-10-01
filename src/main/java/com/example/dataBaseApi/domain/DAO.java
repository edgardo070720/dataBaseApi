package com.example.dataBaseApi.domain;

import jakarta.servlet.http.PushBuilder;

import java.util.List;

public class DAO {
    private IDataBase dataBase;

    public void createProducto(Producto producto,String nameDataBase,List<Producto> _productos){

        dataBase= Configuration.configureAdapterDB(nameDataBase, _productos);
        dataBase.insertarRegistro(producto);
    }
    public List<Producto> readProducto(String nameDataBase,List<Producto> _productos){
        dataBase= Configuration.configureAdapterDB(nameDataBase,_productos);
        return dataBase.consultarRegistro();
    }
    public void updateProducto(Producto producto,String nameDataBase,List<Producto> _productos){
        dataBase= Configuration.configureAdapterDB(nameDataBase,_productos);
        dataBase.actualizarRegistro(producto);
    }
    public void deleteProducto(Producto producto,String nameDataBase,List<Producto> _productos){
        dataBase= Configuration.configureAdapterDB(nameDataBase,_productos);
        dataBase.eliminarRegistro(producto);
    }
}
