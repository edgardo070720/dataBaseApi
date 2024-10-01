package com.example.dataBaseApi.domain;

import java.util.List;

public class ConcreteMySql implements IDataBaseFactory{
    @Override
    public IDataBase createDataBase(List<Producto> _productos) {
        return new MySql(_productos);
    }
}
