package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;


public enum DAO {
    
    Anexo {
        public AnexoDAO getAnexoInstance() {
          return new AnexoDAO();
        }
      };
    
      public AnexoDAO getAnexoInstance() {
        return Anexo.getAnexoInstance();
      }
}
