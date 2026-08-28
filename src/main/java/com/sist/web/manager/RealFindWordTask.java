package com.sist.web.manager;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sist.web.vo.RealFindVO;

@Component
// 단점 => 브라우저로 전송이 안됨 => 데이터베이스마 파일 변경
// 데이터베이스 백업
// 소규모 => 대규모 : Spring Batch
public class RealFindWordTask {
	private static int index=1;
	@Async
	@Scheduled(fixedRate = 60*1*1000)
	public void task()
	{
		List<RealFindVO> list= DataCollection.dataCollect();
		for(RealFindVO vo:list)
		{
			System.out.println("======="+index+"========");
			System.out.println("Rank:"+vo.getRank());
			System.out.println("Word:"+vo.getWord());
		}
	}
}
