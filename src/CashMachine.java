public class CashMachine {
    private int tempPass;

    public CashMachine(int pass){
        tempPass=pass;
    }
    public void checkPass(int password, Client client){
        if(tempPass==password){
            System.out.println("Пароль введен правильно!\nОстальная часть функционала банкомата находится в разработке(((\nПриходите позже!");
        }else {
            client.switchIsBlocked();
            System.out.println("Пароль неверный\nкарта заблокирована:)");

        }
    }
}
