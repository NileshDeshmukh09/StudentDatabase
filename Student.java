
public class Student {

    private String firstName ;
    private String lastName ;
    private int gradYear ;
    private String studentID ;
    private String courses ;
    private int tutionBalance;
    private int costOfCourse = 600;
    
    // Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Firstname :");
        this.firstName = sc.nextLine();

        System.out.print("Enter the LastName :");
        this.lastName = sc.nextLine();
        
        System.out.print("1 - Freshment\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level :");
        this.gradYear = sc.nextInt();
        System.out.println( );
    }

    // Generate an ID

    // Enroll in Courses

    // View Balance 

    // Pay Tuition 

    // Show status


}
