package si.mp.le.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

public class Execute {

	public static void main(String[] args) {
		PrintSome ps = new Print();
		ProxyFactory pf = new ProxyFactory();
		Advice ad = new PrintAdvice();
		pf.addAdvice(ad); //추가하고
		pf.setTarget(ps); //ps를 집어넣으면 addadvice는 감쌀 수 있음
		
		Print p = (Print)pf.getProxy();
		p.hello();
	}
}
