public class TestaEx {
    public static void main(String[] args) {
        System.out.println();
        Conta conta1 = new Conta(123, 123);
        Conta conta2 = new Conta(123, 234);
        Conta conta3 = new Conta(123, 456);
        Conta conta4 = new Conta(123, 567);
        Conta conta5 = new Conta(123, 678);
        Conta conta6 = new Conta(123, 890);
        Conta conta7 = new Conta(123, 901);
        System.out.println();
        System.out.println(Conta.getTotal());
    }
}
