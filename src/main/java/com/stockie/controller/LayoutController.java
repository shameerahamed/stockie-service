package com.stockie.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stockie.model.Layout;
import com.stockie.service.LayoutService;

@RestController
public class LayoutController {
private static final Logger logger = Logger.getLogger("LayoutController");
	
	@Autowired
	private LayoutService layoutService;
	
	@RequestMapping(value="/layout", method = RequestMethod.GET)
	public ResponseEntity<List<Layout>> getAllLayouts() {
		List<Layout> layouts = layoutService.listLayouts();
		
		if (layouts == null || layouts.isEmpty()) {
			return new ResponseEntity<List<Layout>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Layout>>(layouts, HttpStatus.OK);
	}
	
	// pass (2) always from UI
	@RequestMapping(value="/layout/{id}", method = RequestMethod.GET)
	public ResponseEntity<Layout> getLayout(@PathVariable("id") int id) {
		logger.info("layoutId :: " + id);
		Layout layoutBean = layoutService.getLayout(id);
		
		if (layoutBean == null) {
			return new ResponseEntity<Layout>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Layout>(layoutBean, HttpStatus.OK);
	}
	
/*	@RequestMapping(value = "/layout/", method = RequestMethod.POST)
	public ResponseEntity<Void> createLayout(@RequestBody LayoutBean layoutBean, UriComponentsBuilder ucBuilder) {
		logger.info("saveLayout");
		layoutService.saveLayout(layoutBean);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/layout/{id}").buildAndExpand(layoutBean.getLayoutId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}*/
	
/*	@RequestMapping(value = "/layout/{id}", method = RequestMethod.PUT)
    public ResponseEntity<LayoutBean> updatelayout(@PathVariable("id") long id, @RequestBody LayoutBean layoutBean) {
		logger.info("Updating layout " + id);
         
        LayoutBean currLayout = layoutService.getLayout(id);
         
        if (currLayout==null) {
        	logger.info("layout with id " + id + " not found");
            return new ResponseEntity<LayoutBean>(HttpStatus.NOT_FOUND);
        }
 
        layoutBean.setLayoutId(id);         
        layoutService.saveLayout(layoutBean);
        
        return new ResponseEntity<LayoutBean>(layoutBean, HttpStatus.OK);
    }*/
	
	
	/*@RequestMapping(value = "/layout/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<LayoutBean> deleteLayout(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting Layout with id " + id);
 
        LayoutBean layoutBean = layoutService.getLayout(id);
        if (layoutBean == null) {
        	logger.info("Unable to delete. Layout with id " + id + " not found");
            return new ResponseEntity<LayoutBean>(HttpStatus.NOT_FOUND);
        }
 
        layoutService.deleteLayout(id);
        return new ResponseEntity<LayoutBean>(HttpStatus.NO_CONTENT);
    }*/ 
}
