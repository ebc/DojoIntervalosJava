package intervalos;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class IntervalosTest {

	@Test
	public void intervalosNotNullTest() {
		int[] numeros = {};
		Intervalos intervalos = new Intervalos(numeros);
		assertNotNull(intervalos);
	}
	

	@Test
	public void existeArrayNumerosTest() {
		int[] numeros = {};
		Intervalos intervalos = new Intervalos(numeros);
		assertNotNull(intervalos.getNumeros());
	}

    @Test
    public void existeNumerosNoArrayTest(){
    	int[] numeros = {1,2,5,8,12,13};
    	Intervalos intervalos = new Intervalos(numeros);
    	assertTrue(intervalos.getNumeros().length == 6);
    }
    
    @Test
    public void existeNumerosOrdenadosNoArrayTest(){
    	int[] numeros = {13,1,2,8,12,5};
    	int[] resultado = {1,2,5,8,12,13};
    	Intervalos intervalos = new Intervalos(numeros);
    	assertTrue(intervalos.getNumeros().length == 6);
    	assertArrayEquals(resultado, intervalos.getNumeros());
    }
    
    @Test
    public void intervaloDe120Eh120(){
    	int[] numeros = {120};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {120,120};
    	assertEquals(1, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    }
    
    @Test
    public void intervaloDe100Eh100() {
    	int[] numeros = {100};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {100,100};
    	assertEquals(1, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    }
    
    @Test
    @Ignore
    public void intervaloDe3e4Eh3e4() {
    	int[] numeros = {3,4};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {3,4};
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    }
    
    @Test
    public void intervaloDe3e5Eh3v5() {
    	int[] numeros = {3,5};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {3,3};
    	int[] resposta2 = {5,5};
    	assertEquals(2, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    	assertArrayEquals(resposta2, intervalos.getIntervalos()[1]);
    
    }
    
    @Test
    public void intervaloDe3e4e5e7Eh3e5v7() {
    	int[] numeros = {3,4,5,7};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {3,5};
    	int[] resposta2 = {7,7};
    	assertEquals(2, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    	assertArrayEquals(resposta2, intervalos.getIntervalos()[1]);
    
    }
    
    @Test
    public void intervaloDe3e4e5e7e8Eh3e5v7e8() {
    	int[] numeros = {3,4,5,7,8};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {3,5};
    	int[] resposta2 = {7,8};
    	assertEquals(2, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    	assertArrayEquals(resposta2, intervalos.getIntervalos()[1]);
    
    }
    @Test
    public void dojoPuzzlesIntervalosTest() {
    	int[] numeros = {100, 101, 102, 103, 104, 105, 110, 111, 113, 114, 115, 150};
    	Intervalos intervalos = new Intervalos(numeros);
    	int[] resposta = {100,105};
    	int[] resposta2 = {110,111};
    	int[] resposta3 = {113,115};
    	int[] resposta4 = {150,150};
    	assertEquals(4, intervalos.getIntervalos().length);
    	assertArrayEquals(resposta, intervalos.getIntervalos()[0]);
    	assertArrayEquals(resposta2, intervalos.getIntervalos()[1]);
    	assertArrayEquals(resposta3, intervalos.getIntervalos()[2]);
    	assertArrayEquals(resposta4, intervalos.getIntervalos()[3]);
    }
}
