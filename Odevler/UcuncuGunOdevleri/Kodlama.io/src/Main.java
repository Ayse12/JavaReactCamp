
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "Aslıhan", "aslihanevcil@outlook.com", 22, "Java-React", 56);
		studentManager.Add(student);
		studentManager.Delete(student);
		studentManager.Update(student);

		student.setName("Aslıhan");

		System.out.println("**********************************");
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(8, "Engin Demiroğ", "engindemirog@abc.com", 32, 3, 5000);
		instructorManager.Add(instructor);
		instructorManager.Delete(instructor);
		instructorManager.Update(instructor);

		instructor.setName("Engin Demiroğ");
		
		System.out.println("**********************************");
		
		UserManager userManager = new UserManager();
		User user = new User(9, "Selin Kılıç", "selinkilic@dfg.com", 25);
		userManager.Add(user);
		userManager.Delete(user);
		userManager.Update(user);

		user.setName("Selin Kılıç");

	}

}
