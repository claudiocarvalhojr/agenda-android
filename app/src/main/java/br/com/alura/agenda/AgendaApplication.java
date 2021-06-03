package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.DAO.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Alex", "51998834623", "alex@gmail.com"));
        dao.salva(new Aluno("Fran", "51123456789", "fran@gmail.com"));
    }
}
