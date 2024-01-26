package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("kkk");
        student.setAge(12);
        student.setSchool("KBV");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //session.delete(student);
        // session.update(student);
         session.save(student);


        Student s =  session.get(Student.class,1);
        //Student s =  session.load(Student.class,2);
        System.out.println(s);
        transaction.commit();
        session.close();
    }
}