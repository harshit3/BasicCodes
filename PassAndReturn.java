import java.util.Scanner;

//Two ways to pass arguments- by value and by reference.

class UI {

	void register(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the courseName-");
	String courseName=scanner.next();
	System.out.println("Enter the curseID:-");
	String courseID=scanner.next();
	System.out.println("Enter Description:-");
	String desp=scanner.next();
	scanner.close();
	
	Course course=new Course();
	course.setCourseName(courseName);
	course.setCourseID(courseID);
	course.setDesp(desp);
	
	Logic logic=new Logic();
	
	
	TimeTable timetable=logic.storeCourseInDB(course);
	System.out.println("Your TimeTable is-");
	System.out.println("CourseName- "+timetable.getCourseName());
	System.out.println("Time- "+timetable.getTime());
	System.out.println("Faculty- "+timetable.getTeacherName());
    System.out.println("Duration- "+timetable.getDuration());
    System.out.println("RoomNo.- "+timetable.getRoomNo());
	}
	
}

	


class Logic{
	TimeTable storeCourseInDB(Course course){
		System.out.println("You are registered.");
		System.out.println("CourseID is "+course.getCourseName()+ ", CousreName is "+course.getCourseID()+", Descripton- "+course.getDesp());
		System.out.println("  ****");
		TimeTable timetable = new TimeTable();
		timetable.setCourseName(course.getCourseName());
		timetable.setDuration("One and half hrs.");
		timetable.setTime("7:30 A.M.");
		timetable.setRoomNo(5);
		timetable.setTeacherName("AMIT");
		return timetable;
	}
}

class TimeTable{
	private String courseName;
	private String time;
	private String teacherName;
	private int roomNo;
	private String duration;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}  
}
	
class Course{
	private String courseName;
	private String courseID;
	private String desp;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	
}

public class PassAndReturn{
	public static void main(String[] args) {
		UI obj=new UI();
		obj.register();
	}
}

