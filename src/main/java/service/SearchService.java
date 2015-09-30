package service;

import dao.SearchDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class SearchService {
    @Autowired
    private SearchDao searchDao;
    
    public String searchWithKey(String keyword)  {
    	String question = "";
    	searchDao.setKeyMap();
        
        Map <String,List<String>> keymap = searchDao.getKeyMap();
        for (Object o : keymap.keySet()) {
            if (o.equals(keyword)) {
            	List<String> qList = keymap.get(o);
            	for(int i=0;i<qList.size();i++){
            		question += qList.get(i) + "\n";
            	}
            }
          } 
        return question;
    }

}
