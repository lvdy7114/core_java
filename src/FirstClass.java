
public class FirstClass {

    public Integer id;
    public String name;

    // this information is optional
    public String location;

    private String password;

    // constructor with location
    public FirstClass(Integer id, String name,String location, String password){
        this.id = id;
        this.name = name;
        this.location = location;
        this.password = password;
    }

    // construction without location
    public FirstClass(Integer id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    // a function that return a string has value of id and name
    public String printValue(){
        return this.id+" : "+this.name;
    }


    // password setter
    public void setPassword(String password){

        if (password.length() < 5){
            System.out.println("You cannot assigned a value of size less than 5 to a password");
        } else
            this.password = password;
    }

    // password getter
    public String getPassword(){

        return this.password;
    }

}

//class example