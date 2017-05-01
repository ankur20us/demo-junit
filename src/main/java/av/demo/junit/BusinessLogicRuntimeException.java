package av.demo.junit;

public class BusinessLogicRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	private String message;
	
	BusinessLogicRuntimeException(String message){
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}

}
