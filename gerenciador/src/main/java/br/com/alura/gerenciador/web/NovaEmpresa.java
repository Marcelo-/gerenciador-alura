package br.com.alura.gerenciador.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class NovaEmpresa implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa(req.getParameter("nome"));
		new EmpresaDAO().adiciona(empresa);
		req.setAttribute("empresa", empresa);

		return "/WEB-INF/paginas/NovaEmpresa.jsp";
	}

}
