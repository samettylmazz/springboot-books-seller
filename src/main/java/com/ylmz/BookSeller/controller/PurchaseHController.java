package com.ylmz.BookSeller.controller;


import com.ylmz.BookSeller.Model.PurchaseH;
import com.ylmz.BookSeller.security.UserPrincipal;
import com.ylmz.BookSeller.service.IPurchaseHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-h")
public class PurchaseHController {

    @Autowired
    private IPurchaseHService purchaseHService;

    @PostMapping
    public ResponseEntity<?> savePurchaseH(@RequestBody PurchaseH purchaseH)
    {
            return new ResponseEntity<>(purchaseHService.savePurchaseH(purchaseH), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchaseOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseHService.findPurchasedItemOfUser(userPrincipal.getId()));
    }
}
