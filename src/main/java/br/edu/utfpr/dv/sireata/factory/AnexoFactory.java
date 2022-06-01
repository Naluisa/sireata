package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.*;
public interface AnexoFactory extends DaoFactory {

    public void excluir(int id) throws Exception;

    public List<Anexo> listarPorAta(int idAta) throws Exception;

}


