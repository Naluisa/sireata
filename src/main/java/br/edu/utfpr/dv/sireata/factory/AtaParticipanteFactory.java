package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.*;

public interface AtaParticipanteFactory extends DaoFactory {
    public void excluir(int id) throws Exception;

    public List<AtaParticipante> listarPorAta(int idAta) throws Exception;
}


