package com.teste.tecnico.luiza.labs.services.implementations;

import com.teste.tecnico.luiza.labs.models.Nfe;
import com.teste.tecnico.luiza.labs.models.NfeSomatorio;
import com.teste.tecnico.luiza.labs.models.NfeTran;
import com.teste.tecnico.luiza.labs.models.NfeTranError;
import com.teste.tecnico.luiza.labs.models.NfeTranSefaz;
import com.teste.tecnico.luiza.labs.models.NfeTranSucesso;
import com.teste.tecnico.luiza.labs.services.CustomerService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import com.teste.tecnico.luiza.labs.services.NfeService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Service
public class NfeServiceImpl implements NfeService {
    
    // Contador responsável por gerar um fake ID 
    private final AtomicLong id = new AtomicLong();
    //recebe os dados instanciados da classe nfe
    private final ArrayList<Nfe> r = new ArrayList<>();
 
    // Método responsável por retornar uma nfe
    @Override
    public Nfe findByChave(String chave) {
        
        ArrayList<Nfe> n = mockNfe();
        
        for (int i = 0; i < n.size(); i++) {
            if(n.get(i).getChave().equals(chave.replaceAll("-", "."))){
                
                return n.get(i);
            }
            
        }
        return null;
    }
 
    // Método responsável por retornar todas as nfe's
    // mais uma vez essas informações são mocks
    @Override
    public List<Nfe> findAll() {
        
        ArrayList<Nfe> n = mockNfe();
       
        return n;
    }
    //Metodo le o arquivo nfe 
    public BufferedReader lerTxt(String txt) {
        
        ApplicationContext appContext = 
                    new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

        CustomerService cust = (CustomerService)appContext.getBean("customerService");
        String path = "classpath:com/teste/txt/"+txt;
        org.springframework.core.io.Resource resource = cust.getResource(path);

        try{
                InputStream is = resource.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                return br;

        }catch(IOException e){
                e.printStackTrace();
        }
        return null;
    }
    //armazenar dados do txt dentro de um arrayList
    private ArrayList<Nfe> mockNfe() {
        
        String line = "";
        String[] c = null;

        BufferedReader br = lerTxt("NFe.txt");

        try {

            while(br.ready()){
                Nfe n = new Nfe();
                line = br.readLine();
                if(!line.startsWith("Data;Tipo;CnpjCpf;Numero;Serie;Modelo;Chave;ValorTotal;ValorProd;ValorICMS;ValorIPI;Status")) {

                     c = line.split(";");
                    if(c.length > 1) {
                        n.setId(id.incrementAndGet());
                        n.setData(c[0]);
                        n.setTipo(c[1]);
                        n.setCnpjCpf(Long.parseLong(c[2]));
                        n.setNumero(Long.parseLong(c[3]));
                        n.setSerie(Integer.parseInt(c[4]));
                        n.setModelo(Integer.parseInt(c[5]));
                        n.setChave(c[6]);     
                        n.setValorTotal(Double.parseDouble(c[7]));   
                        n.setValorProd(Double.parseDouble(c[8]));
                        n.setValorICMS(Double.parseDouble(c[9]));
                        n.setValorIPI(Double.parseDouble(c[10]));
                        n.setStatus(c[11]);

                        r.add(n);
                    }
                 }                    
            }
            br.close();
            
            return r;
        } catch (IOException ex) {
            Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    //filtro para documento do cliente da nfe
    @Override
    public ArrayList<Nfe> findDoc(String nfeDoc) {
        
        ArrayList<Nfe> n = mockNfe();
        ArrayList<Nfe> r = new ArrayList<>();
        for (int i = 0; i < n.size(); i++) {
            Nfe nn = new Nfe();
            
            if(n.get(i).getCnpjCpf().equals(Long.parseLong(nfeDoc))){

                nn.setId(n.get(i).getId());
                nn.setData(n.get(i).getData());
                nn.setTipo(n.get(i).getTipo());
                nn.setCnpjCpf(n.get(i).getCnpjCpf());
                nn.setNumero(n.get(i).getNumero());
                nn.setSerie(n.get(i).getSerie());
                nn.setModelo(n.get(i).getModelo());
                nn.setChave(n.get(i).getChave());     
                nn.setValorTotal(n.get(i).getValorTotal());   
                nn.setValorProd(n.get(i).getValorProd());
                nn.setValorICMS(n.get(i).getValorICMS());
                nn.setValorIPI(n.get(i).getValorIPI());
                nn.setStatus(n.get(i).getStatus());

                r.add(nn);
            }
        }
        return r;
    }
    //filtro pelo status da nfe
    @Override
    public List<Nfe> findStatus(String nfeStatus) {
        
        ArrayList<Nfe> n = mockNfe();
        ArrayList<Nfe> r = new ArrayList<>();
        for (int i = 0; i < n.size(); i++) {
            Nfe nn = new Nfe();
            
            if(n.get(i).getStatus().equals(nfeStatus)){

                nn.setId(n.get(i).getId());
                nn.setData(n.get(i).getData());
                nn.setTipo(n.get(i).getTipo());
                nn.setCnpjCpf(n.get(i).getCnpjCpf());
                nn.setNumero(n.get(i).getNumero());
                nn.setSerie(n.get(i).getSerie());
                nn.setModelo(n.get(i).getModelo());
                nn.setChave(n.get(i).getChave());     
                nn.setValorTotal(n.get(i).getValorTotal());   
                nn.setValorProd(n.get(i).getValorProd());
                nn.setValorICMS(n.get(i).getValorICMS());
                nn.setValorIPI(n.get(i).getValorIPI());
                nn.setStatus(n.get(i).getStatus());

                r.add(nn);
            }
        }
        return r;
    }
    //filtro pelo periodo e tipo de transação
    @Override
    public List<Nfe> findPeriodoTipo(String tipo, String dataD, String dataA) {
        
        ArrayList<Nfe> n = mockNfe();
        ArrayList<Nfe> r = new ArrayList<>();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < n.size(); i++) {
            Nfe nn = new Nfe();
            try {
                if(dt.parse(dataA).before(dt.parse(n.get(i).getData())) && 
                        dt.parse(dataD).after(dt.parse(n.get(i).getData()))){
                    if(n.get(i).getTipo().equals(tipo)){

                        nn.setId(n.get(i).getId());
                        nn.setData(n.get(i).getData());
                        nn.setTipo(n.get(i).getTipo());
                        nn.setCnpjCpf(n.get(i).getCnpjCpf());
                        nn.setNumero(n.get(i).getNumero());
                        nn.setSerie(n.get(i).getSerie());
                        nn.setModelo(n.get(i).getModelo());
                        nn.setChave(n.get(i).getChave());
                        nn.setValorTotal(n.get(i).getValorTotal());
                        nn.setValorProd(n.get(i).getValorProd());
                        nn.setValorICMS(n.get(i).getValorICMS());
                        nn.setValorIPI(n.get(i).getValorIPI());
                        nn.setStatus(n.get(i).getStatus());

                        r.add(nn);
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }
    //faz somátorio em base do filtro pelo periodo e tipo de transação
    @Override
    public ArrayList<NfeSomatorio> findPeriodoTipoSomatorio(String tipo, String dataD, String dataA) {
        ArrayList<Nfe> n = mockNfe();
        ArrayList<NfeSomatorio> rr = new ArrayList<>();
        double somaValorTotal = 0,somaValorProd = 0, somaValorICMS = 0, somaValorIPI = 0;
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < n.size(); i++) {
            
            try {
                if(dt.parse(dataA).before(dt.parse(n.get(i).getData())) && 
                        dt.parse(dataD).after(dt.parse(n.get(i).getData()))){
                    
                    if(n.get(i).getTipo().equals(tipo)){

                        somaValorTotal += n.get(i).getValorTotal();
                        somaValorProd += n.get(i).getValorProd();
                        somaValorICMS += n.get(i).getValorICMS();
                        somaValorIPI += n.get(i).getValorIPI();


                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        NfeSomatorio nn = new NfeSomatorio();
        nn.setId(Long.parseLong("1"));
        nn.setSomaValorTotal(somaValorTotal);
        nn.setSomaValorProd(somaValorProd);
        nn.setSomaValorICMS(somaValorICMS);
        nn.setSomaValorIPI(somaValorIPI);
        
        rr.add(nn);
        return rr;
    }
    //filtro pela chave do nfeTran
    @Override
    public ArrayList<NfeTran> finTranChave(String nfeChave) {
        
        String line = "";
        String[] c = null;
        BufferedReader br = lerTxt("NFeTran.txt");
        ArrayList<NfeTran> rr = new ArrayList<>();
        
        
        try {
            while(br.ready()){
                NfeTran nn = new NfeTran();
                line = br.readLine();
                if(line.contains(nfeChave)) {
                    NfeTran n = new NfeTran();
                    nn.setId(id.incrementAndGet());
                    nn.setLinha(line);

                    rr.add(nn);
                }
            }
            return rr;
        } catch (IOException ex) {
            Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    //fcontagem de transações falhas
    @Override
    public ArrayList<NfeTranError> finTraEstatisticaErro() {
        String line = "";
        String[] c = null;
        BufferedReader br = lerTxt("NFeTran.txt");
        ArrayList<NfeTranError> rr = new ArrayList<>();
        int i = 0;
        
        try {
            while(br.ready()){
                
                line = br.readLine();
                if(line.contains("Error")) {
                    i++;
                    
                }
            }
            NfeTranError nn = new NfeTranError();
            nn.setId(id.incrementAndGet());
            nn.setQtd(i);
            nn.setTipo("TimeoutError Falha na conexão, será realizada uma nova tentativa.");

            rr.add(nn);
             
            return rr;
        } catch (IOException ex) {
            Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    //fcontagem de transações bem sucedidas
    @Override
    public List<NfeTranSucesso> finTraEstatisticaSucesso() {
        String line = "";
        String[] c = null;
        BufferedReader br = lerTxt("NFeTran.txt");
        ArrayList<NfeTranSucesso> rr = new ArrayList<>();
        int i = 0;
        
        try {
            while(br.ready()){
                
                line = br.readLine();
                if(line.contains("sucesso")) {
                    i++;
                    
                }
            }
            NfeTranSucesso nn = new NfeTranSucesso();
            nn.setId(id.incrementAndGet());
            nn.setQtd(i);
            nn.setTipo("NFe's autorizadas com sucesso pela SEFAZ.");

            rr.add(nn);
             
            return rr;
        } catch (IOException ex) {
            Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    //estátistica por sefaz
    @Override
    public List<NfeTranSefaz> finTranSefaz(String estado) {
        String line = "",concat = "";
        String[] c = null;
        BufferedReader br = lerTxt("NFeTran.txt");
        ArrayList<NfeTranSefaz> rr = new ArrayList<>();
        int countLinha = 0,contErro = 0,contSucess = 0,contReseitado = 0;
        
        try {
            while(br.ready()){
                
                line = br.readLine();
                countLinha++;
                
                concat += line;
                
                if(countLinha == 6) {
                    String[] conc = concat.split("#");
                    if(conc[4].contains(estado.toUpperCase())) {
                        
                        if(conc[5].contains("Error")) {
                            
                            contErro++;
                        } else if(conc[5].contains("sucesso")) {
                            
                            contSucess++;
                        } else if(conc[5].contains("rejeitou")) {
                            
                            contReseitado++;
                        }
                    }
                    concat = "";
                    countLinha = 0;
                }
            }
            NfeTranSefaz nn = new NfeTranSefaz();
            nn.setId(Long.parseLong("1"));
            nn.setQtdErro(contErro);
            nn.setQtdSucesso(contSucess);
            nn.setQtdeRejeitado(contReseitado);
            nn.setStado(estado);
            
            rr.add(nn);
             
            return rr;
        } catch (IOException ex) {
            Logger.getLogger(NfeServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
}
