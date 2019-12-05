package daos;

import java.util.List;

public interface DAO <T>{

    T findById(Integer id);

    List findAll();

    String update (T dto, Integer id);

    String create (T dto);

    Boolean delete (Integer id);

}
