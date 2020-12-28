package com.teachbrain.feginclientf.repository.impl;

import com.teachbrain.feginclientf.repository.BaseRepository;

import java.io.Serializable;
import java.util.List;

public class BaseRepositoryImpl<E extends Serializable> implements BaseRepository<E> {
    @Override
    public E save(E e) {
        return null;
    }

    @Override
    public E update(E e) {
        return null;
    }

    @Override
    public E getById(String id) {
        return null;
    }

    @Override
    public List<E> getAll() {
        return null;
    }

    @Override
    public void delete(E e) {

    }
}
