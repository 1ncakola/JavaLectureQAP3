public class CollegeStudent extends Student {
    private int myYear;
    private String myMajor;

    public CollegeStudent (String name, int age, String gender, String idNum, double gpa, int year, String major){  
        super (name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    
}

//Getter Methods

public int getYear() {
    return myYear;
}

public String getMajor() {
    return myMajor;
}

//Settler Methods

public void setYear (int year){
    myYear = year;
}

public void setMajor (String major){
    myMajor = major;
}


@Override
public String toString(){
    return super.toString() + ", year: " + myYear + ", major: " + myMajor;
}
}