package lk.Ijse.pharmAssist.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> extends SuperDAO {
    ArrayList<T> getAll();
    boolean add(T entity);
    boolean update(T entity);
    boolean exist(String id);
    String generateNewID();
    boolean delete(String id);
    T search(String id);
}
