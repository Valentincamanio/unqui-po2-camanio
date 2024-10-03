package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WikipediaPageTest {
	
	WikipediaPage wiki;
	WikipediaPage wiki2;
	WikipediaPage wiki3;
	WikipediaPage mainPage;
	Map<String, WikipediaPage> map1 = new HashMap<>();
	Map<String, WikipediaPage> map2 = new HashMap<>();
	List<WikipediaPage>pages;
	List<WikipediaPage> resultados;
	
	@BeforeEach
	void setUp() throws Exception {
		
		wiki = new WikipediaPage ("La plata", map1, new ArrayList<>());
		wiki2 = new WikipediaPage ("Lobos", map2, new ArrayList<>());
		wiki3 = new WikipediaPage ("Liniers", map1, new ArrayList<>());
		
		this.pages=Arrays.asList(wiki, wiki2, wiki3);
		
		mainPage = new WikipediaPage ("Liniers", map2, pages);
		
		map1.put("Plata", wiki3);
		map2.put("Plata", wiki);

	}
	
	@Test
	void testPrimerFiltro() {
		resultados = mainPage.getPagesSameFirstChar('L');
		assertEquals(3, resultados.size());
	}
	
	@Test
	void testSegundoFiltro() {
		resultados = mainPage.getPagesWithSameLink();
		assertEquals(1, resultados.size());
	}

}
