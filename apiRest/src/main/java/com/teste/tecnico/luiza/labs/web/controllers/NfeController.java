package com.teste.tecnico.luiza.labs.web.controllers;

import com.teste.tecnico.luiza.labs.models.Nfe;
import com.teste.tecnico.luiza.labs.models.NfeSomatorio;
import com.teste.tecnico.luiza.labs.models.NfeTran;
import com.teste.tecnico.luiza.labs.models.NfeTranError;
import com.teste.tecnico.luiza.labs.models.NfeTranSefaz;
import com.teste.tecnico.luiza.labs.models.NfeTranSucesso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.teste.tecnico.luiza.labs.services.NfeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
//Mapeia as requisições de localhost:8080/nfe/

@RequestMapping("/nfe/")
public class NfeController {
    //Por padrão todas as requisições respondem com o status code 200 success
    
    @Autowired
    private NfeService nfeService;
    
    //NFeTran.txt
    @CrossOrigin
   @ResponseStatus(HttpStatus.OK) 
    @RequestMapping(value = "/tran/filter/chave/{nfeChave}",
        //Mapeia as requisições GET para localhost:8080/nfe/tran/filter/chave
        //recebendo um ID como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<NfeTran> nfeTranChave(@PathVariable(value = "nfeChave") String nfeChave){
        return nfeService.finTranChave(nfeChave);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK) 
    @RequestMapping(value = "/tran/filter/sefaz/{nfeEstado}",
        //Mapeia as requisições GET para localhost:8080/nfe/tran/filter/sefaz
        //recebendo um ID como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<NfeTranSefaz> nfeTranSefaz(@PathVariable(value = "nfeEstado") String estado){
        return nfeService.finTranSefaz(estado);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK) 
    @RequestMapping(value = "/tran/filter/estatistica/error",
        //Mapeia as requisições GET para localhost:8080/nfe/tran/filter/estatistica/error
        //recebendo um ID como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<NfeTranError> nfeTranEstatisticaErro(){
        return nfeService.finTraEstatisticaErro();
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK) 
    @RequestMapping(value = "/tran/filter/estatistica/sucesso",
        //Mapeia as requisições GET para localhost:8080/nfe/tran/filter/chave/estatistica/sucess
        //recebendo um ID como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<NfeTranSucesso> nfeTranEstatisticaSucesso(){
        return nfeService.finTraEstatisticaSucesso();
    }
    
    //NFe.txt
        @CrossOrigin
        @ResponseStatus(HttpStatus.OK) 
        @RequestMapping(value = "/filter/chave/{nfeChave}",
        //Mapeia as requisições GET para localhost:8080/nfe/chave
        //recebendo um ID como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public Nfe getFilterChave(@PathVariable(value = "nfeChave") String nfeChave){
        return nfeService.findByChave(nfeChave);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/doc/{nfeDoc}", //doc - cpf ou cnpj
        //Mapeia as requisições GET para localhost:8080/nfe/filter/doc/
        //recebendo o cnpj ou cpf como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<Nfe> getFilterDoc(@PathVariable(value = "nfeDoc") String nfeDoc){
        return nfeService.findDoc(nfeDoc);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/status/{nfeStatus}",
        //Mapeia as requisições GET para localhost:8080/nfe/filter/status/
        //recebendo o status como @PathVariable
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<Nfe> getFilterStatus(@PathVariable(value = "nfeStatus") String nfeStatus){
        return nfeService.findStatus(nfeStatus);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/periodoTipo/{tipo}",
        //Mapeia as requisições GET para localhost:8080/nfe/filter/periodoTipo/
        //recebendo periodo  como @PathVariable e o tipo como RequestParam
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<Nfe> getPeriodoTipo(@PathVariable(value = "tipo") String tipo,@RequestParam(value = "dataA") String dataA,@RequestParam(value = "dataD") String dataD){
        return nfeService.findPeriodoTipo(tipo,dataD,dataA);
    }
    
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/filter/periodoTipoSomatorio/{tipo}",
        //Mapeia as requisições GET para localhost:8080/nfe/filter/periodoTipo/
        //recebendo periodo  como @PathVariable e o tipo como RequestParam
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<NfeSomatorio> getPeriodoTipoSomatorio(@PathVariable(value = "tipo") String tipo,@RequestParam(value = "dataA") String dataA,@RequestParam(value = "dataD") String dataD){
        return nfeService.findPeriodoTipoSomatorio(tipo,dataD,dataA);
    }
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    //Por padrão responde com o status code 200 success
    
    @RequestMapping(value = "/filter/all",
        //Mapeia as requisições GET para localhost:8080/person/findAll
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
        // Produz JSON como retorno
    public List<Nfe> findAll(){
        return nfeService.findAll();
    }
}

