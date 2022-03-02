package com.ylmz.BookSeller.service;

import com.ylmz.BookSeller.Model.PurchaseH;
import com.ylmz.BookSeller.Repository.IPurchaseHRepository;
import com.ylmz.BookSeller.Repository.projection.IPurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHService implements IPurchaseHService{
    @Autowired
    private final IPurchaseHRepository purchaseHRepository;


    public PurchaseHService(IPurchaseHRepository purchaseHRepository) {
        this.purchaseHRepository = purchaseHRepository;
    }

    @Override
    public PurchaseH savePurchaseH(PurchaseH purchaseH){
        purchaseH.setPurchaseTime(LocalDateTime.now());
        return purchaseHRepository.save(purchaseH);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemOfUser(Long userId){
        return  purchaseHRepository.findAllPurchasesOfUser(userId);
    }
}
