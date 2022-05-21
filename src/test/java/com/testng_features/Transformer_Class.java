package com.testng_features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer_Class implements IAnnotationTransformer  {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		// Instead of mentioning @Test(retryAnalyser = Retry_Class.class for each and every method we can use this IAnnotationTransformer
		
		annotation.setRetryAnalyzer(Retry_Class.class);
	}
}
