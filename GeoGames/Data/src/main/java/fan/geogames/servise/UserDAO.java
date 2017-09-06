package fan.geogames.servise;

import fan.geogames.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO implements DAOInterface {

    public EntityManager entityManager = Persistence.createEntityManagerFactory("GEOGAMES").createEntityManager();

    public List<Users> getAll() {
        TypedQuery<Users> namedQuery = entityManager.createNamedQuery("Users.getAll", Users.class);
        return null;
    }

    public Users get(int id) {
        return entityManager.find(Users.class, id);
    }

    public Users add(Object entity) {
        entityManager.getTransaction().begin();
        Users usersFromDB = (Users) entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return usersFromDB;
    }

    public void update(Object entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void delete(int id) {
        entityManager.getTransaction().begin();
        entityManager.remove(get(id));
        entityManager.getTransaction().commit();
    }
}
