package ie.atu.assignment_1;

// create a maven project

public class Passenger {
    private String title;
    private String Name;
    private String pNum;
    private int age;
    private String ID;

    public Passenger(String title, String Name, String pNum, int age, String ID) {
        this.title = title;
        this.Name = Name;
        this.pNum = pNum;
        this.age = age;
        this.ID = ID;
    }

    public String title(){
        if(title == "Mr" || title == "Mrs" || title == "Ms" ){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("This is not a valid Title. ");
        }
        return title;
    }

    public String Name(){
        if(Name.length() > 3){
            this.Name = Name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid Name.");
        }
        return Name;
    }

    public String pNum(){
        if(pNum.length() > 7){
            this.pNum = pNum;
        }
        else{
            throw new IllegalArgumentException("This is not a valid Phone number");
        }
        return pNum;
    }

    public int age(){
        if(age > 16){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Must be over 16 to apply");
        }
        return age;
    }

    public String ID(){
        if(ID.length() > 10){
            this.ID = ID;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID");
        }
        return ID;
    }
}
