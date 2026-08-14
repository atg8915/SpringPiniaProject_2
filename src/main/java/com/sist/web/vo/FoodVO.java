package com.sist.web.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/*
 *   NO                                        NOT NULL NUMBER
	 CNO                                                NUMBER
	 NAME                                      NOT NULL VARCHAR2(100)
	 TYPE                                      NOT NULL VARCHAR2(200)
	 PHONE                                     NOT NULL VARCHAR2(20)
	 ADDRESS                                   NOT NULL VARCHAR2(500)
	 PRICE                                              VARCHAR2(30)
	 SCORE                                              NUMBER(2,1)
	 THEME                                     NOT NULL CLOB
	 TIME                                               VARCHAR2(100)
	 RESERVE                                            VARCHAR2(100)
	 PARKING                                   NOT NULL VARCHAR2(100)
	 CONTENT                                   NOT NULL CLOB
	 POSTER                                    NOT NULL VARCHAR2(260)
	 IMAGES                                             CLOB
	 LIKECOUNT                                          NUMBER
	 REPLYCOUNT                                         NUMBER
	 JJIMCOUNT                                          NUMBER
	 HIT                                                NUMBER
	 
	 1. 메소드 규칙
	 2. JOIN 처리
	 3. SQL작성 @Query
	 ----------------
	 4. JPQL => 객체 단위 처리
 */
@Data
public class FoodVO {
	private int no;
	private int cno,likecount,jjimcount,hit,replycount;
	private String name,reserve,images,address,phone,parking,poster,time,content,price,theme,type;
	private double score;
	
}
