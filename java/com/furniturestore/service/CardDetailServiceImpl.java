package com.furniturestore.service;

import com.furniturestore.dao.CardDetailDao;
import com.furniturestore.model.CardDetail;
import com.furniturestore.service.CardDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CardDetailServiceImpl implements CardDetailService{

    @Autowired
    private CardDetailDao cardDetailDao;

    public void addCardDetail (CardDetail cardDetail) {
    	cardDetailDao.addCardDetail(cardDetail);
    }

 
}
