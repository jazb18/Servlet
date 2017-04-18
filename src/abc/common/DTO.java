package abc.common;

import java.util.List;

public abstract class DTO<T> {
	
	List<T> data;
	
	public int save(){
		return 0;
	}
	
	public List<T> list(){
		return data;
	} 
	 
}
