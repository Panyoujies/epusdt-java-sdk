package com.bomaos.epusdtsdkjava.utils.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * epusdt sdk
 * date:   2022-05-23 15:56
 * Url：   github.com/panyoujies
 */
@Data
@ToString
public class EpusdtNotify implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trade_id;
    private String order_id;
    private BigDecimal amount;
    private BigDecimal actual_amount;
    private String token;
    private String block_transaction_id;
    private String signature;
    private Integer status;
}
