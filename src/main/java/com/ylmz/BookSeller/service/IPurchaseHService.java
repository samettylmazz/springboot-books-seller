package com.ylmz.BookSeller.service;

import com.ylmz.BookSeller.Model.PurchaseH;
import com.ylmz.BookSeller.Repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHService {
    PurchaseH savePurchaseH(PurchaseH purchaseH);

    List<IPurchaseItem> findPurchasedItemOfUser(Long userId);
}
