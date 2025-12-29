package store.yd2team.common.service;

import java.sql.Date;

import lombok.Data;

@Data
public class SubscriptionVO {
	
	private String subspId;// 구독ID
	private String vendId;// 업체ID
	private String subspPlanId;// 구독플랜ID
	private Long acctUseCnt;// 할당계정수
	private Long apiUseCnt;// 할당API수
	private Date startDt;// 구독시작일
	private Date endDt;// 구독종료일
	private Date creaDt;// 생성일자
	private String creaBy;// 생성자
	private Date updtDt;// 수정일자
	private String updtBy;// 수정자 (UPDATE 시 사용)
	
}// end class