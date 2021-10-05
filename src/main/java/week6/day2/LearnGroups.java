package week6.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnGroups {
	
	@Test(groups ="smoke",retryAnalyzer = RetryFailedTestCases.class)
	public void login() {
	// TODO Auto-generated method stub
	System.out.println("Application Login TC");


}
	
	@Test(groups ={"regression","functional"},dependsOnGroups="smoke",retryAnalyzer = RetryFailedTestCases.class)
		public void createLead() {
		// TODO Auto-generated method stub
		System.out.println("createLead Test case");
	
	}
	
	@Test(groups ={"regression","functional"},dependsOnGroups="smoke",retryAnalyzer = RetryFailedTestCases.class)
	
	public void editLead() {
		// TODO Auto-generated method stub
		 System.out.println("EditLead Test case");
			throw new NoSuchElementException();
	}

@Test(groups ="functional",dependsOnGroups="smoke",retryAnalyzer = RetryFailedTestCases.class)
	
	public void duplicateLead() {
		// TODO Auto-generated method stub
	System.out.println("DuplicateLead Test Case");

	}


@Test(groups ="functional",dependsOnGroups="smoke",retryAnalyzer = RetryFailedTestCases.class)

public void mergeLead() {
	// TODO Auto-generated method stub
System.out.println("MergeLead Test Case");

}
@Test(groups ={"regression","functional"},dependsOnGroups="smoke",retryAnalyzer = RetryFailedTestCases.class)
public void deleteLead() {
	// TODO Auto-generated method stub
System.out.println("Delete Test Case");

}
}
