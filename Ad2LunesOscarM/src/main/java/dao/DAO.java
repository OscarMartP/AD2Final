package dao;

import java.util.*;

public interface DAO <T> {
    List <T> getAll();

    void save(T t);
    
    T get(int id);
    
    void update(T t);
    }