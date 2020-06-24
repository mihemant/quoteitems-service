package com.avaya.psn.quoteitems.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avaya.psn.quoteitems.model.QuoteItems;

@Repository
public interface QuoteItemRepository extends MongoRepository<QuoteItems,String> {
	public List<QuoteItems> findByconfigId(int configId);
	public QuoteItems findByOfferTag(String offerTag);
}
