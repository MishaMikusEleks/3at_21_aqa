package day_6_7.hibernate;

import day_6_7.model.Address;
import day_6_7.model.Student;
import org.hibernate.Session;

import java.util.Date;

public class HibernateClient {
    Integer user_id=7;
    private static Session session=HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) {
       // crudUser();

//        Address address= new Address();
//        address.setId_address(2);
//        address.setCountry("Ukraine");
//        address.setCity("Kyiv");
//        save(address);

        session.beginTransaction();
        System.out.println(session.createQuery("SELECT a FROM Address a", Address.class).getResultList());
        session.getTransaction().commit();


        session.close();
    }

    private static void save(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    private static void crudUser() {

        Integer id=7;
        Student student= new Student();
        student.setId_student(id);
        student.setCourse(1);
        student.setName("Misha Mikus "+id);
        student.setBd(new Date());

        System.out.println(student);

        //CRUD
        //Create
        save(student);

        //Read
        session.beginTransaction();
        Student readStudent = session.get(Student.class,id);
        session.getTransaction().commit();
        System.out.println(readStudent);

        //Update
        student.setName(student.getName()+" updated");
        session.beginTransaction();
        session.update(student);
        System.out.println(session.get(Student.class,id));
        session.getTransaction().commit();

        //Delete
        session.beginTransaction();
        session.delete(student);
        System.out.println(session.get(Student.class,id));
        session.getTransaction().commit();



    }

}
