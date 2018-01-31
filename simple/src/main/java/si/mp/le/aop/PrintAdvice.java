package si.mp.le.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PrintAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("내가 먼저얌");
		Object obj =  mi.proceed();
		System.out.println("함수?뀨? 나는 나중에");
		return obj;
	}

}
