package kr.co.laura.security.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@RequiredArgsConstructor
@Getter
@Setter
public class MemCountDTO {
	
	private Long countNewMems; 
	private String mdate;
	
	
	public MemCountDTO(Long countNewMems,String mdate) {
		this.countNewMems = countNewMems;
		this.mdate = mdate;
		//this.mdate = mdate;
		//System.out.println
		//("Memcount dto 생성자: mdate : "+mdate
		//		+" 가입수:"+countNewMems);
		
	}
	

}
