package com.kh.spring21.vo;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class KakaoPayDetailResponseVO {
	private String tid, cid, status;
	private String partnerOrderId, partnerUserId;
	private String paymentMethodType; // 결제수단(Card/Money)
	private KakaoPayAmountVO amount, canceledAmount, cancelAvailableAmount;
	private String itemName, itemCode; // 상품명/코드
	private int quantity; // 수량
	private Date createdAt, approvedAt, canceledAt; // 준비/승인 시각
	private KakaoPaySelectedCardInfoVO selectedCardInfo;
//	private KakaoPaymentActionDetailVO[] paymentActionDetails;
	private List<KakaoPaymentActionDetailVO> paymentActionDetails;
}
