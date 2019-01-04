package Collections;

public class Student {

	private String studentRegistration;

	public Student(String studentRegistration) {

		this.studentRegistration = studentRegistration;
	}

	public String getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(String studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	@Override
	public String toString() {
		return this.studentRegistration;
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Student) {
			String regNumber = ((Student) o).getStudentRegistration();

			if (regNumber != null && regNumber.equals(this.studentRegistration)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.studentRegistration.hashCode();
	}
}
