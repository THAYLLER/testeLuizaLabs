/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.tecnico.luiza.labs.services.implementations;

import com.teste.tecnico.luiza.labs.models.Nfe;
import com.teste.tecnico.luiza.labs.models.NfeSomatorio;
import com.teste.tecnico.luiza.labs.models.NfeTran;
import com.teste.tecnico.luiza.labs.models.NfeTranError;
import com.teste.tecnico.luiza.labs.models.NfeTranSefaz;
import com.teste.tecnico.luiza.labs.models.NfeTranSucesso;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thayller
 */
public class NfeServiceImplTest {
    
    public NfeServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findByChave method, of class NfeServiceImpl.
     */
    @Test
    public void testFindByChave() {
        System.out.println("findByChave");
        String chave = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        Nfe expResult = null;
        Nfe result = instance.findByChave(chave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class NfeServiceImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        NfeServiceImpl instance = new NfeServiceImpl();
        List<Nfe> expResult = null;
        List<Nfe> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerTxt method, of class NfeServiceImpl.
     */
    @Test
    public void testLerTxt() {
        System.out.println("lerTxt");
        String txt = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        BufferedReader expResult = null;
        BufferedReader result = instance.lerTxt(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDoc method, of class NfeServiceImpl.
     */
    @Test
    public void testFindDoc() {
        System.out.println("findDoc");
        String nfeDoc = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        ArrayList<Nfe> expResult = null;
        ArrayList<Nfe> result = instance.findDoc(nfeDoc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findStatus method, of class NfeServiceImpl.
     */
    @Test
    public void testFindStatus() {
        System.out.println("findStatus");
        String nfeStatus = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        List<Nfe> expResult = null;
        List<Nfe> result = instance.findStatus(nfeStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPeriodoTipo method, of class NfeServiceImpl.
     */
    @Test
    public void testFindPeriodoTipo() {
        System.out.println("findPeriodoTipo");
        String tipo = "";
        String dataD = "";
        String dataA = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        List<Nfe> expResult = null;
        List<Nfe> result = instance.findPeriodoTipo(tipo, dataD, dataA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPeriodoTipoSomatorio method, of class NfeServiceImpl.
     */
    @Test
    public void testFindPeriodoTipoSomatorio() {
        System.out.println("findPeriodoTipoSomatorio");
        String tipo = "";
        String dataD = "";
        String dataA = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        ArrayList<NfeSomatorio> expResult = null;
        ArrayList<NfeSomatorio> result = instance.findPeriodoTipoSomatorio(tipo, dataD, dataA);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finTranChave method, of class NfeServiceImpl.
     */
    @Test
    public void testFinTranChave() {
        System.out.println("finTranChave");
        String nfeChave = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        ArrayList<NfeTran> expResult = null;
        ArrayList<NfeTran> result = instance.finTranChave(nfeChave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finTraEstatisticaErro method, of class NfeServiceImpl.
     */
    @Test
    public void testFinTraEstatisticaErro() {
        System.out.println("finTraEstatisticaErro");
        NfeServiceImpl instance = new NfeServiceImpl();
        ArrayList<NfeTranError> expResult = null;
        ArrayList<NfeTranError> result = instance.finTraEstatisticaErro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finTraEstatisticaSucesso method, of class NfeServiceImpl.
     */
    @Test
    public void testFinTraEstatisticaSucesso() {
        System.out.println("finTraEstatisticaSucesso");
        NfeServiceImpl instance = new NfeServiceImpl();
        List<NfeTranSucesso> expResult = null;
        List<NfeTranSucesso> result = instance.finTraEstatisticaSucesso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finTranSefaz method, of class NfeServiceImpl.
     */
    @Test
    public void testFinTranSefaz() {
        System.out.println("finTranSefaz");
        String estado = "";
        NfeServiceImpl instance = new NfeServiceImpl();
        List<NfeTranSefaz> expResult = null;
        List<NfeTranSefaz> result = instance.finTranSefaz(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
