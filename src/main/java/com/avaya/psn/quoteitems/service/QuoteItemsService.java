package com.avaya.psn.quoteitems.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avaya.psn.quoteitems.model.QuoteItems;
import com.avaya.psn.quoteitems.repository.QuoteItemRepository;

@Service
public class QuoteItemsService {
	@Autowired
	private QuoteItemRepository quoteitemsRepository;
	
	public List<QuoteItems> getAll(){
		return quoteitemsRepository.findAll();
	}
	
	public List<QuoteItems> getByConfigId(int configId) {
		return quoteitemsRepository.findByconfigId(configId);
	}
	
	public QuoteItems getByOfferTag(String offerTag) {
		return quoteitemsRepository.findByOfferTag(offerTag);
	}
	
	public QuoteItems create(int configId,String offerTag,String offerName,float offerPrice,String offerType) {
		return quoteitemsRepository.save(new QuoteItems(configId,offerTag,offerName,offerPrice,offerType));
	}
	
	public QuoteItems Update(int configId,String offerTag,String offerName,float offerPrice,String updatedBy) {
		QuoteItems q=quoteitemsRepository.findByOfferTag(offerTag);
		q.setDateUpdated(LocalDateTime.now());
		q.setOfferTag(offerTag);
		q.setOfferName(offerName);
		q.setOfferPrice(offerPrice);
		q.setUpdatedBy(updatedBy);
		return quoteitemsRepository.save(q);
	}
}
