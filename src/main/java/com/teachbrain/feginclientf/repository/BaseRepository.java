package com.teachbrain.feginclientf.repository;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends Serializable> {
    E save(E e);
    E update(E e);
    E getById(String id);
    List<E> getAll();
    void delete(E e);
}
