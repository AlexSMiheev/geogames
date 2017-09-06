package fan.geogames.servise;

import javax.persistence.EntityManager;
import java.util.List;

public interface DAOInterface <A> {

    public abstract List<A> getAll();
    public abstract A get(int id);
    public abstract A add(A entity);
    public abstract void update(A entity);
    public abstract void delete(int id);
}
