package av.demo.junit;

/**
 * @author av
 *
 */
public class BusinessLogicCompiletimeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	
	BusinessLogicCompiletimeException(String message){
		this.message = message;
	}
	
	@Override
	public String toString(){
		return message;
	}
	
	
}
