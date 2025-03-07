package br.edu.utfpr.dv.sireata.bo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.utfpr.dv.sireata.dao.AtaParticipanteDAO;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;
import br.edu.utfpr.dv.sireata.factory.*;

public class AtaParticipanteBO {
	private AtaParticipanteFactory dao;

	public AtaParticipanteBO(){
		this.dao = DAO.AtaParticipante.getAtaParticipanteInstance();
	}
	public Object buscarPorId(int id) throws Exception{
		
		try{
			return dao.buscarPorId(id);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public List<AtaParticipante> listarPorAta(int idAta) throws Exception{
		try{
			return dao.listarPorAta(idAta);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public void validarDados(AtaParticipante participante) throws Exception{
		if((participante.getParticipante() == null) || (participante.getParticipante().getIdUsuario() == 0)){
			throw new Exception("Informe o usuário.");
		}
		if((!participante.isPresente()) && (participante.getMotivo().trim().isEmpty())){
			throw new Exception("Informe o motivo da ausência.");
		}
		if(participante.isPresente()){
			participante.setMotivo("");
		}
	}
	
	public int salvar(AtaParticipante participante) throws Exception{
		try{
			if((participante.getAta() == null) || (participante.getAta().getIdAta() == 0)){
				throw new Exception("Informe a ata.");
			}
			
			this.validarDados(participante);
			
			AtaParticipanteDAO dao = new AtaParticipanteDAO();
			
			return dao.salvar(participante);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}
	
	public void excluir(AtaParticipante participante) throws Exception{
		this.excluir(participante.getIdAtaParticipante());
	}
	
	public void excluir(int id) throws Exception{
		try{
			dao.excluir(id);
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			throw new Exception(e.getMessage());
		}
	}

}
