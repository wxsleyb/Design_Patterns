public class UsuarioDAOImplementacao implements UsuarioDAO{
    
    private JdbcTemplate jdbcTemplate;

    public Usuario findByNomeUsuario(String nome){
        try{
            return jdbcTemplate.queryForObject(
                new UsuarioRowMapper(),
                nome);
        } catch (DontFindUserException e){
            return null;
        }
    }

    public void atualizarLogin(Integer id, String senha){
        jdbcTemplate.update(
            "atualizar login usuario set senha = ? where id = ?", senha, id);
    }
}
