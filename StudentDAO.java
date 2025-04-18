import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StudentDAO {
 private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

 public void createStudent(Student student) {
  Session session = factory.openSession();
  Transaction tx = session.beginTransaction();
  session.save(student);
  tx.commit();
  session.close();
 }

 public Student readStudent(int id) {
  Session session = factory.openSession();
  Student student = session.get(Student.class, id);
  session.close();
  return student;
 }

 public void updateStudent(Student student) {
  Session session = factory.openSession();
  Transaction tx = session.beginTransaction();
  session.update(student);
  tx.commit();
  session.close();
 }

 public void deleteStudent(int id) {
  Session session = factory.openSession();
  Transaction tx = session.beginTransaction();
  Student student = session.get(Student.class, id);
  if (student != null) {
   session.delete(student);
  }
  tx.commit();
  session.close();
 }
}
