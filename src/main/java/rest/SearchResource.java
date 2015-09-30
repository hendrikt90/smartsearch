package rest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import service.SearchService;

@RestController
@RequestMapping(value = "/search")
public class SearchResource {
    @Autowired
    private SearchService searchService;

	static final Logger logger = Logger.getLogger(SearchResource.class);	
	
	@RequestMapping(method = RequestMethod.GET)
	public String listCustomers() {
	        return "Test method GET";
	}

	@RequestMapping(value = "{keyword}", method = RequestMethod.GET)
	public String viewCustomer(@PathVariable String keyword) {
	        return searchService.searchWithKey(keyword);
	}
	
    @RequestMapping(method = RequestMethod.POST)
    public String createCustomer(@RequestBody String keyword) {
        return keyword;
    }

 
    
}
