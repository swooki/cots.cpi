package gov.ohio.jfs.cots.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MeasurePerformance {
    @Pointcut("execution(** *(..))")
    public void execution() {}

    @Around("execution()")
    public void measureElapsedTime(ProceedingJoinPoint jp) {
	try {
	    
	} catch (Throwable e) {
	    
	}
    }
}
