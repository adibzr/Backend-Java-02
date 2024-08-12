import dao.UserDao;
import model.User;

import util.DataGenerator;
import util.ExampleDB;

import java.util.List;

// Ej06/h2/bin
// java -jar h2-2.3.230.jar

public class App {
    public static void main(String[] args) {

        System.out.println("HW-06 DAO");
/*
        System.out.println("Ejemplo simple");
        ExampleDB.useDB();

 */

/*
        System.out.println("Generando datos..");
        DataGenerator.generate();
        System.out.println("Users:");
        DataGenerator.printUsers();
        System.out.println("Departments:");
        DataGenerator.printDepartments();
*/


        UserDao userDao = new UserDao();

        // add user
//        User user = new User(55L,"Sergio Reyes22", "sergio@gmail.com", "calle 1234", "asdf1234");
//        userDao.add(user);

        // get y upd
//        User userNro1 =  userDao.getById(2L);
//        System.out.println("Usuario 2:" + userNro1);
//        userNro1.setDireccion("nueva direccion de usuario id 2");
//        userNro1.setNombreApellido("Nuevo nombre del usuario 2");
//        userDao.upd(userNro1);

        // getAll
   //     System.out.println("Listado de Usuarios:");
        List<User> users= userDao.getAll();
//        users.stream()
//                .forEach(System.out::println);

        //del
//        userDao.del(userNro1);

        users= userDao.getAll();
        users.stream()
                .forEach(System.out::println);




    }
}
