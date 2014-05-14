package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub

		String email = req.getParameter("email");
		String senha = req.getParameter("senha");

		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		String mensagem;
		if (usuario == null) {
			mensagem = "Usuario ou senha invalido.";
		} else {
			req.getSession().setAttribute("usuarioLogado", usuario);
			mensagem = email;
		}

		req.setAttribute("mensagem", mensagem);
		return "WEB-INF/paginas/login.jsp";

	}

}