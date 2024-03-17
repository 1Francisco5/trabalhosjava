package excercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void testinfo() {
		int[] nasc= {15,7,2004};
		String nome= "Francisco";
		String snome ="Almeida";
		HeartRates heart = new HeartRates(nome,snome,nasc);
		assertEquals(heart.freqcardmax(),200);
	}

}
