import java.util.Scanner;

public class Keyboard {
    private Client client;

    public Keyboard(Client client){
        this.client=client;
    }
    public int inputPassword(){
        if (!client.getIsBlocked()){
            System.out.println(client.getName()+ ", ведите пароль: ");
            return new Scanner(System.in).nextInt();
        }
        return 0;
    }
}
