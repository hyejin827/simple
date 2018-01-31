package si.mp.le.method;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Designer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] arg2) throws Throwable {
		//developer의 dowork 메소드
		return "디자이너 일중~~~~";
	}
}
