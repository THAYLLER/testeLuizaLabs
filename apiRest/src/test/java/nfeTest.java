/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static io.restassured.RestAssured.get;
import static io.restassured.http.ContentType.JSON;
import org.junit.Test;

/**
 *
 * @author darthd3v
 */
public class nfeTest {
    
    private String base_url = "/nfe/filter";
    
    @Test
    public void findAll() {
        
        get(this.base_url+"/all")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON); 
    }
    
    @Test
    public void periodoTipoSomatorio() {
        
        get(this.base_url+"/periodoTipoSomatorio/E?dataA=01/04/2017&dataD=30/04/2017")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void periodoTipo() {
        
        get(this.base_url+"/periodoTipoSomatorio/E?dataA=01/04/2017&dataD=30/04/2017")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void filterStatus() {
        
        get(this.base_url+"/status/AUTORIZADO")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void filterDoc() {
        
        get(this.base_url+"/doc/4867532983")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void filterChave() {
        
        get(this.base_url+"/chave/8.99588614556625E+043")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
}
