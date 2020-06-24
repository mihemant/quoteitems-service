package com.avaya.psn.quoteitems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaya.psn.quoteitems.model.QuoteItems;
import com.avaya.psn.quoteitems.service.QuoteItemsService;

@RestController
public class QuoteItemsController {

	@Autowired
	private QuoteItemsService quoteItemsService;
	
	@RequestMapping("/create")
	public String create(@RequestParam int configId,@RequestParam String offerTag,@RequestParam String offerName,@RequestParam float offerPrice,@RequestParam String offerType) {
		QuoteItems quoteitems=quoteItemsService.create(configId,offerTag,offerName,offerPrice,offerType);
		return quoteitems.toString();
	}
	
	@RequestMapping("/get")
	public List<QuoteItems> get(@RequestParam int configId) {
		return quoteItemsService.getByConfigId(configId);
	}
	
	@RequestMapping("/getAll")
	public List<QuoteItems> getAll() {
		return quoteItemsService.getAll();
	}
}
