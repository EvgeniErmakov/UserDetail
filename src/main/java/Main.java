
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;

public class Main {

    public static void main(String[] args) throws ParseException {

        addUserAdnUserDetails();
        //retrieveUserAndUserDetails();
        //deleteUserAndUserDetails();

    }

    public static void addUserAdnUserDetails() throws ParseException {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            session.beginTransaction();

            SimpleDateFormat birthdayFormat = new SimpleDateFormat("dd/mm/yyyy");
            Timestamp tb = new Timestamp(birthdayFormat.parse("03/03/2019").getTime());

            UserDetail userDetails = new UserDetail("Belaruss", "Minskk", tb);
            User user = new User("Bob111`", "Dou1111", "asdasdasd@mail.com.by", "passwordstub", "saltstub",
                    new Timestamp(System.currentTimeMillis()), userDetails);

            session.save(user);

            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }

    }

    public static void retrieveUserAndUserDetails() {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int id = 4;
            User user = session.get(User.class, 1);

            if (user != null) {
                System.out.println(user.getEmail() + " - ");
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }

    public static void deleteUserAndUserDetails() {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
                .addAnnotatedClass(UserDetail.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        int id = 4;
        User user = session.get(User.class, id);

        if (user != null) {
            session.delete(user);
        }

        session.getTransaction().commit();

        factory.close();

    }

}