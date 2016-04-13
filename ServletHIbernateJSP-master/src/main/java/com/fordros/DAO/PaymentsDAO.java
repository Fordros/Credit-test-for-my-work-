package com.fordros.DAO;

import com.fordros.entity.Payments;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Fordros on 25.03.2016.
 */
public interface PaymentsDAO extends GenericDAO <Payments, BigDecimal> {
    public List<Payments> findAllPaymentByAccId(Integer accId);
}
