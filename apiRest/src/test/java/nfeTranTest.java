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
public class nfeTranTest {
    
    private String base_url = "/nfe/tran/filter";
    
    @Test
    public void estatisticaErro() {
        
        get(this.base_url+"/estatistica/error")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void sefaz() {
        
        get(this.base_url+"/sefaz/SP")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
    
    @Test
    public void chave() {
        
        get(this.base_url+"/chave/81256")
                .then()
                .statusCode(200)
                .and()
                .contentType(JSON);
    }
}
