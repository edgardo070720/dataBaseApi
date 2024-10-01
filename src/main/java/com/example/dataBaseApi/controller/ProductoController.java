package com.example.dataBaseApi.controller;

import com.example.dataBaseApi.domain.DAO;
import com.example.dataBaseApi.domain.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ProductoController {
    private final DAO dao=new DAO();
    private final List<Producto> productos=new ArrayList<>();


//    @GetMapping("/{dataBase}/producto")
//    public ResponseEntity<?> getProducto(@PathVariable String dataBase){
//        Producto producto= new Producto("123","computadora HP",250);
//        dao.createProducto(producto,dataBase,productos);
//     return ResponseEntity.ok(producto);
//    }
    @GetMapping("/{dataBase}/productos")
    public ResponseEntity<?> getProductos(@PathVariable String dataBase){
        return ResponseEntity.ok(dao.readProducto(dataBase,productos));
    }
    @PostMapping("/{dataBase}/producto")
    public ResponseEntity<?> saveProducto(@PathVariable String dataBase, @RequestBody Producto producto){
        dao.createProducto(producto,dataBase,productos);
        return ResponseEntity.ok(producto);
    }


}
