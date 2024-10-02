package com.example.dataBaseApi.domain;

import java.util.List;

public class ConcreteOracle implements IDataBaseFactory{
    @Override
    public IDataBase createDataBase(List<Producto> _productos) {
        return new Oracle(_productos);
    }
}
