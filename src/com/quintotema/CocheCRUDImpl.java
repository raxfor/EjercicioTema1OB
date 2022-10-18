package com.quintotema;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public List<Vehiculo> findAll() {
        System.out.println("find all");
        return null;
    }

    @Override
    public void delete() {
        String nombreM = "delete";
        System.out.println(nombreM);
    }

}
