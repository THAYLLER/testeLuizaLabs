package com.teste.tecnico.luiza.labs.services;

import com.teste.tecnico.luiza.labs.models.Nfe;
import com.teste.tecnico.luiza.labs.models.NfeSomatorio;
import com.teste.tecnico.luiza.labs.models.NfeTran;
import com.teste.tecnico.luiza.labs.models.NfeTranError;
import com.teste.tecnico.luiza.labs.models.NfeTranSefaz;
import com.teste.tecnico.luiza.labs.models.NfeTranSucesso;
import java.util.List;

public interface NfeService {
    
    // escopo de todos os métodos criados no pack services
    Nfe findByChave(final String nfeChave);
    List<Nfe> findAll();
    List<Nfe> findDoc(final String nfeDest);
    List<Nfe> findStatus(String nfeStatus);
    List<Nfe> findPeriodoTipo(String tipo, String dataD, String dataA);
    
    List<NfeSomatorio> findPeriodoTipoSomatorio(String tipo, String dataD, String dataA);
    
    List<NfeTran> finTranChave(String nfeChave);
    List<NfeTranError> finTraEstatisticaErro();
    List<NfeTranSucesso> finTraEstatisticaSucesso();
    List<NfeTranSefaz> finTranSefaz(String estado);

}
