
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "Asl�han", "aslihanevcil@outlook.com", 22, "Java-React", 56);
		studentManager.Add(student);
		studentManager.Delete(student);
		studentManager.Update(student);

		student.setName("Asl�han");

		System.out.println("**********************************");
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(8, "Engin Demiro�", "engindemirog@abc.com", 32, 3, 5000);
		instructorManager.Add(instructor);
		instructorManager.Delete(instructor);
		instructorManager.Update(instructor);

		instructor.setName("Engin Demiro�");
		
		System.out.println("**********************************");
		
		UserManager userManager = new UserManager();
		User user = new User(9, "Selin K�l��", "selinkilic@dfg.com", 25);
		userManager.Add(user);
		userManager.Delete(user);
		userManager.Update(user);

		user.setName("Selin K�l��");

	}

}
