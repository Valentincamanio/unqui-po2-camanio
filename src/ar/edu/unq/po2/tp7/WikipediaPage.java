package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WikipediaPage implements IWikipediaPage{

	public WikipediaPage(String tittle, List<WikipediaPage> pagesAmigas, Map<String, WikipediaPage> mapInfoBox) {
		this.tittle = tittle;
		this.pagesAmigas = pagesAmigas;
		this.mapInfoBox = mapInfoBox;
	}

	String tittle;
	List<WikipediaPage>pagesAmigas = new ArrayList <WikipediaPage>();
	Map<String, WikipediaPage> mapInfoBox ;
	
	public List<WikipediaPage> getPagesSameFirstChar(){
		List<WikipediaPage> res = new ArrayList<WikipediaPage>();
		
		return res;
	}
	
	@Override
	public String getTitle() {
		return tittle;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		return pagesAmigas;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		return mapInfoBox;
	}

}
