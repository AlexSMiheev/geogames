package fan.geogames.entity;


import fan.geogames.servise.UserDAO;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;

public class Users {

    UserDAO service = new UserDAO();
    Date currentDate = new Date();

    @Test
    public void testSaveRecord() throws Exception {

        //Создаем пользователя для записи в БД
        Users users = new Users();

        users.setUserId(1);
        users.setLogin("Admin");
        users.setPassword("Derparol");
        users.setUserName("Feofan");
        users.setUserSurname("Koklushkin");
        users.setEmail("admin@geogames.fan");
        users.setRegDate(currentDate.toString());
        users.setRole(0);
        users.setDelStatus(0);

        //Записали в БД
        Users user = service.add(users);

        //Вывели записанную в БД запись
        System.out.println(user);
    }

    @Test
    public void testDeleteRecord() throws Exception {
        //Создаем пользователя для записи в БД
        Users users = new Users();

        users.setUserId(1);
        users.setLogin("Admin");
        users.setPassword("Derparol");
        users.setUserName("Feofan");
        users.setUserSurname("Koklushkin");
        users.setEmail("admin@geogames.fan");
        users.setRegDate(currentDate.toString());
        users.setRole(0);
        users.setDelStatus(0);

        //Записали в БД
        Users user = service.add(users);

        //Удвлем его с БД
        service.delete(user.getUserId());
    }

    @Test
    public void testSelect() throws Exception {
        //Создаем пользователя для записи в БД
        Users users = new Users();

        users.setUserId(1);
        users.setLogin("Admin");
        users.setPassword("Derparol");
        users.setUserName("Feofan");
        users.setUserSurname("Koklushkin");
        users.setEmail("admin@geogames.fan");
        users.setRegDate(currentDate.toString());
        users.setRole(0);
        users.setDelStatus(0);

        //Записываем в БД
        Users user = service.add(users);

        //Получние с БД пользователя‎
        Users userFromDB = service.get(user.getUserId());
        System.out.println(userFromDB);
    }

    @Test
    public void testUpdate() throws Exception {
        //Создаем пользователя для записи в БД
        Users users = new Users();

        users.setUserId(1);
        users.setLogin("Admin");
        users.setPassword("Derparol");
        users.setUserName("Feofan");
        users.setUserSurname("Koklushkin");
        users.setEmail("admin@geogames.fan");
        users.setRegDate(currentDate.toString());
        users.setRole(0);
        users.setDelStatus(0);

        //Записываем в БД
        Users user = service.add(users);

        users.setEmail("root@geogames.fan");

        //Обновляем
        service.update(users);

        //Получаем обновленую запись
        Users newUser = service.get(users.getUserId());
        System.out.println(newUser);
    }

    public void testGetAll(){
        //Создаем пользователя для записи в БД
        Users user1 = new Users();
        user1.setUserId(1);
        user1.setLogin("Admin");
        user1.setPassword("Derparol");
        user1.setUserName("Feofan");
        user1.setUserSurname("Koklushkin");
        user1.setEmail("admin@geogames.fan");
        user1.setRegDate(currentDate.toString());
        user1.setRole(0);
        user1.setDelStatus(0);

        //Создаем автомобиль для записи в БД
        Users user2 = new Users();
        user2.setUserId(1);
        user2.setLogin("Admin");
        user2.setPassword("Derparol");
        user2.setUserName("Feofan");
        user2.setUserSurname("Koklushkin");
        user2.setEmail("admin@geogames.fan");
        user2.setRegDate(currentDate.toString());
        user2.setRole(0);
        user2.setDelStatus(0);

        //Создаем автомобиль для записи в БД
        Users user3 = new Users();
        user3.setUserId(1);
        user3.setLogin("Admin");
        user3.setPassword("Derparol");
        user3.setUserName("Feofan");
        user3.setUserSurname("Koklushkin");
        user3.setEmail("admin@geogames.fan");
        user3.setRegDate(currentDate.toString());
        user3.setRole(0);
        user3.setDelStatus(0);

        //Сохраняем все авто
        service.add(user1);
        service.add(user2);
        service.add(user3);

        //Получаем все авто с БД
        List<Users> users = service.getAll();

        //Выводим полученый список авто
        for(Users u : users){
            System.out.println(u);
        }
    }
}
