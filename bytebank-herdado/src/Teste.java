public class Teste {
    public static void main(String[] args) {
        FuncionarioTeste f1 = new FuncionarioTeste();
        f1.setSalario(3000.00);
        // System.out.println(f1.getTipo());
        // System.out.println(f1.getBonificacao());
        System.out.println("O salário bruto eh " + (f1.getBonificacao() + f1.getSalario()));

        FuncionarioTeste f2 = new FuncionarioTeste();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        // System.out.println(f2.getTipo());
        // System.out.println(f2.getBonificacao());
        System.out.println("O salário bruto eh " + (f2.getBonificacao() + f2.getSalario()));

        FuncionarioTeste f3 = new FuncionarioTeste();
        f3.setTipo(2);
        f3.setSalario(8000.0);
        // System.out.println(f3.getTipo());
        // System.out.println(f3.getBonificacao());
        System.out.println("O salário bruto eh " + (f3.getBonificacao() + f3.getSalario()));

    }
}
