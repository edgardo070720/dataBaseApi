package com.example.dataBaseApi.domain;

import java.util.List;

public interface IDataBaseFactory {
    public IDataBase createDataBase(List<Producto> _productos);
}
