package com.example.dataBaseApi.domain;

import java.util.List;

public class Configuration {
    static IDataBase configureAdapterDB(String nameDataBase, List<Producto> _productos){
        IDataBaseFactory factory=null;
        if(nameDataBase.equals("MySql")){
            factory=new ConcreteMySql();
        }
        if(nameDataBase.equals("Oracle")){
            factory= new ConcreteOracle();
           ;
        }
        return factory != null ? factory.createDataBase(_productos) : null;
    }
}
