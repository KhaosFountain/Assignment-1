package ie.atu.assignment_1;

// create a maven project

public class Passenger {

    public String title(String t){
        String title = t;
        if(title == "Mr" || title == "Mrs" || title == "Ms" ){
            System.out.printf(title + " ");
        }
        else{
            throw new IllegalArgumentException("either you are a married man or woman....or you are single....no in betweens");
        }
        return title;
    }

    public String Name(String n){
        String Name = n;
        if(Name.length() > 3){
            System.out.printf(Name + "\n");
        }
        else{
            throw new IllegalArgumentException("whose name is less 3 characters long.....you have a default name");
        }
        return Name;
    }

    public String pNum(String num){
        String pNum = num;
        if(pNum.length() > 7){
            System.out.printf("Phone Number: " + pNum + "\n");
        }
        else{
            throw new IllegalArgumentException("I cant call you with that number...enter it properly....basic stuff");
        }
        return pNum;
    }

    public int age(int a){
        int age = a;
        if(age > 16){
            System.out.printf("age: %d \n", age);
        }
        else{
            throw new IllegalArgumentException("What are you doing here you are too young for this....get lost");
        }
        return age;
    }

    public String ID(String id){
        String ID = id;
        if(ID.length() > 10){
            System.out.printf("ID: " + ID);
        }
        else{
            throw new IllegalArgumentException("Either you enter the correct ID or you leave...simple math");
        }
        return ID;
    }
}
