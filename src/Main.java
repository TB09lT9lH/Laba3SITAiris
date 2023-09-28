import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Client cl = new Client("Вася", 12345678);
    Keyboard kb = new Keyboard(cl);
    CashMachine cm = new CashMachine(cl.getPassword());

    while (true){
        System.out.println("1-Ввести пароль\nлюбой другой символ-выйти");
        int key = new Scanner(System.in).nextInt();
        switch (key){
            case 1 -> cm.checkPass(kb.inputPassword(), cl);
            default -> {
                return;
            }
        }
    }



    }
}