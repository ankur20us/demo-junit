package av.demo.junit;

public class BusinessLogic {

	public int divide(final int a, final int b) throws BusinessLogicRuntimeException{
		if(b==0){
			throw new BusinessLogicRuntimeException("Divide by 0 not possible");
		}
		return a/b;
	}
	
	public int add(final int a, final int b) throws BusinessLogicCompiletimeException{
		if(b==0){
			throw new BusinessLogicCompiletimeException("2nd parameter I want something not 0");
		}
		return a+b;
	}
}
