public class Client {
    private int password;
    private String name;
    private boolean isBlocked;
    public Client (String name, int password){
        this.name=  name;
        this.password= password;
        isBlocked=false;
    }

    public void switchIsBlocked(){
        isBlocked=true;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }


    public int getPassword() {
        return password;
    }



    public String getName() {
        return name;
    }



}
