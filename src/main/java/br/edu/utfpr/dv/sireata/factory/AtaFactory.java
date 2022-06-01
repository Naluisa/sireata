package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.*;

public interface AtaFactory extends DaoFactory {

    public boolean excluir(int id) throws Exception;

    public Ata buscarPorNumero(int idOrgao, TipoAta tipo, int numero, int ano) throws Exception;

    public Ata buscarPorPauta(int idPauta) throws Exception;

    public int buscarProximoNumeroAta(int idOrgao, int ano, TipoAta tipo) throws Exception;

    public List<Ata> listarPublicadas() throws Exception;

    public List<Ata> listarPorOrgao(int idOrgao) throws Exception;

    public List<Ata> listarPorDepartamento(int idDepartamento) throws Exception;

    public List<Ata> listarPorCampus(int idCampus) throws Exception;

    public List<Ata> listarNaoPublicadas(int idUsuario) throws Exception;

    public List<Ata> listarPorOrgao(int idOrgao, int idUsuario) throws Exception;

    public List<Ata> listarPorDepartamento(int idDepartamento, int idUsuario) throws Exception;

    public List<Ata> listarPorCampus(int idCampus, int idUsuario) throws Exception;

    public boolean temComentarios(int idAta) throws Exception;

    public boolean isPresidenteOuSecretario(int idUsuario, int idAta) throws Exception;

    public boolean isPresidente(int idUsuario, int idAta) throws Exception;

    public boolean isPublicada(int idAta) throws Exception;

    public void liberarComentarios(int idAta) throws Exception;

    public void bloquearComentarios(int idAta) throws Exception;

    public void publicar(int idAta, byte[] documento) throws Exception;
}
