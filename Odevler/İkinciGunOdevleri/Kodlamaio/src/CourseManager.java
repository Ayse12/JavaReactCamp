
public class CourseManager {
	public void Add(Courses course) {
		System.out.println("Course added:" + " " + course.name);

	}

	public void Update(Courses course) {
		System.out.println("Course updated:" + " " + course.name);
	}

	public void Delete(Courses course) {
		System.out.println("Course deleted:" + " " + course.name);
	}

}
