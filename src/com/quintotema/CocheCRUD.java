package com.quintotema;

import java.util.List;

public interface CocheCRUD {
    void save();

    List<Vehiculo> findAll();

    void delete();

}
