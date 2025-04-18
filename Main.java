public class Main {
 public static void main(String[] args) {
  StudentDAO dao = new StudentDAO();

  Student s1 = new Student();
  s1.setName("Alice");
  s1.setAge(21);
  dao.createStudent(s1);

  Student fetched = dao.readStudent(s1.getId());
  System.out.println(fetched.getId() + " " + fetched.getName() + " " + fetched.getAge());

  fetched.setAge(22);
  dao.updateStudent(fetched);

  Student updated = dao.readStudent(fetched.getId());
  System.out.println(updated.getId() + " " + updated.getName() + " " + updated.getAge());

  dao.deleteStudent(updated.getId());
 }
}
