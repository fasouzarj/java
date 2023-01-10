public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do EDITOR DE VIDEO");
        return super.getBonificacao() + 100;
    }
}