public interface UsuarioDAO {
    Usuario findByNomeUsuario(String nome);
    void atualizarLogin(Integer id, String senha);
}