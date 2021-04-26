public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses("C# + Angular", 1, "Engin Demiroð", 56);
		Courses course2 = new Courses("Java + React", 2, "Engin Demiroð", 36);
		Courses course3 = new Courses("Programlamaya Giriþ Ýçin Temel Kurs", 3, "Engin Demiroð", 100);

		Courses[] courses = { course1, course2, course3 };

		for (Courses course : courses) {
			System.out.println("Course name:" + course.name);
			System.out.println("Course id:" + course.id);
			System.out.println("Course instructor:" + course.instructor);
			System.out.println("Course percent:" + course.percent);
			System.out.println("******************************");
		}

		Category category1 = new Category();
		category1.Id = 3;
		category1.name = "Programlama";

		System.out.println(
				category1.Id + " " + "numaralý" + " " + category1.name + " " + "kategorisi hizmete açýlmýþtýr.");
		System.out.println(" ");

		CourseManager courseManager = new CourseManager();
		courseManager.Add(course3);
		courseManager.Update(course2);
		courseManager.Delete(course1);

	}

}
