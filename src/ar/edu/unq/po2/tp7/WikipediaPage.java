package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WikipediaPage implements IWikipediaPage{

	public WikipediaPage(String tittle, Map<String, WikipediaPage> mapInfoBox,List<WikipediaPage> pagesAmigas) {
		this.tittle = tittle;
		this.mapInfoBox = mapInfoBox;
		this.pagesAmigas=pagesAmigas;
	}

	public List<WikipediaPage> getPagesAmigas() {
		return pagesAmigas;
	}

	String tittle;
	List<WikipediaPage>pagesAmigas;
	Map<String, WikipediaPage> mapInfoBox ;
	
	// El problema de esta funcion es que no deberia pasarle ningun caracter sino que se deberia dar cuenta solo
	public List<WikipediaPage> getPagesSameFirstChar(Character prefijo){
		List<WikipediaPage> res = new ArrayList<WikipediaPage>();
		for (WikipediaPage x: pagesAmigas) {
			if(x.tittle.charAt(0)==prefijo) {
				res.add(x);
			}
		}
		return res;
	}
	
	public List<WikipediaPage> getPagesWithSameLink(){
		List<WikipediaPage> res = new ArrayList<WikipediaPage>();
		for (WikipediaPage pa: pagesAmigas) {
			if (this.getKeyInfobox()==pa.getKeyInfobox()){
				res.add(pa);
			}
		}
		return res ;
	}
	
	public Set<String> getKeyInfobox() {
		return mapInfoBox.keySet();
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
