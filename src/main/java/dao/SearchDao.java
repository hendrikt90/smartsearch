package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SearchDao {
	Map<String, List<String>> keyMap = new HashMap<String, List<String>>();
	
	public void setKeyMap(){
		List<String> keyList = new ArrayList<String>();
		keyList.add("Is red a primary colour?");
		keyMap.put("red", keyList);
		
		keyList = new ArrayList<String>();
		keyList.add("Is green made from yellow and blue?");
		keyList.add("why is the sky blue?");
		keyMap.put("green", keyList);
		
		keyList = new ArrayList<String>();
		keyList.add("Is green made from yellow and blue?");		
		keyMap.put("blue",keyList);
	}
	
	public Map<String, List<String>> getKeyMap(){
		return this.keyMap;
	}
}
