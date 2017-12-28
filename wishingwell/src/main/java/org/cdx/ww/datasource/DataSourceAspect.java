package org.cdx.ww.datasource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect implements Ordered {

	private int order;

    @Value("10")
    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
		return order;
	}

    @Pointcut(value="execution(public com.cdx.ww.service..*.*(..))")
    public void anyPublicMethod() { }

	@Around("@annotation(dataSource)")
    public Object proceed(ProceedingJoinPoint pjp, DataSource dataSource) throws Throwable {
        try {
            DbContextHolder.setDbType(dataSource.value());
            Object result = pjp.proceed();
            DbContextHolder.clearDbType();
            return result;
        } finally {
            // restore state
            DbContextHolder.clearDbType();
        }
    }

}
