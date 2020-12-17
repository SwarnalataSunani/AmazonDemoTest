package in.amazon.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer{
	public static int count = 0;
	private int retryCnt = 0;
	int totalcount = 0;
     private int maxRetryCnt = 1;

	@Override
	public boolean retry(ITestResult result) {
		
		System.out.println("total call : "+totalcount);
		totalcount++;
		// TODO Auto-generated method stub
		 if (retryCnt < maxRetryCnt) {
	            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt));
	            retryCnt++;
	            count = retryCnt;
	            return true;
	        }
		 
	        return false;
	}

}

