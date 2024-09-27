package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.Map;

public interface IWikipediaPage {

	public String getTitle();
	
	public List<WikipediaPage> getLinks();
	
	public Map<String, WikipediaPage> getInfobox();
	
}
