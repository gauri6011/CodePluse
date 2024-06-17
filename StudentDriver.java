class student{
	String sname;
	String nplace;
	String education;
	String branch;
	int yop;
	double cgpa;
	long contactNumber;

	public void displayStudentDetails(){
	System.out.println("******* student Details********");
	System.out.println("Name: "+sname);
	System.out.println("Native Place: "+nplace);
	System.out.println("Education: "+education);
	System.out.println("Branch: "+branch);
	System.out.println("Year of Passout: "+yop);
	System.out.println("CGPA: "+cgpa);
	System.out.println("Contact Number: "+contactNumber);
	System.out.println();
	}
}
class StudentDriver{
	public static void main(String[]args){
	student obj=new student();
	obj.sname="Gauri";
	obj.nplace="Patas";
	obj.education="BE";
	obj.branch="IT";
	obj.yop=2025;
	obj.cgpa=9.10;
	obj.contactNumber=987654321l;
	obj.displayStudentDetails();
	}
}
