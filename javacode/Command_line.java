class Command_line
{
	public static void main(String []k)
	{
		String name;
		int Uroll;
		String course;
		int sem;
		
		name= k[0];
		Uroll=Integer.parseInt(k[1]);
		course=k[2];
		sem=Integer.parseInt(k[3]);
		System.out.println("Name:"+name);
		
		System.out.println("university Roll no:"+Uroll);
		
		System.out.println("Course:"+course);
		
		System.out.println("Semester:"+sem+"th");
	}
}
