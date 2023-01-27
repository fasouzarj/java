public class TestaConexao {

    public static void main(String[] args) {
        // metodo novo
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");

        }
        // metodo antigo
        // Conexao con = null;
        // try {
        // con = new Conexao();
        // con.leDados();
        // } catch (IllegalStateException ex) {
        // System.out.println("deu erro na conexão");
        // } finally {
        // System.out.println("finally");
        // if(con != null) {
        // con.close();

        // }

        // }
    }
}
