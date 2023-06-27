public class Client extends Person{
    private int sum; // змінна для зберігання суми на рахунку
    private String bank;

    public Client(String name,  String bank, int sum) {
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
