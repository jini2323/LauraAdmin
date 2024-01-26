package kr.co.laura.security.repositoryQVisit;

import java.util.List;

import kr.co.laura.security.dto.VisitDTO;

public interface QVisitRepositoryCustom {
	
	//QueryDSL 로 커스텀해서 사용할 메소드 선언하는 파일
	
	public VisitDTO countByVisitDate();
	//지난주 비회원포함 총 방문수
	public List<VisitDTO> showLastWeekCountVisitWithDate();
	
}
