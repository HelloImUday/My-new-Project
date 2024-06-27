import org.testng.annotations.Test;

import pageclass.com.CandidateModule;
import pageclass.com.DashBoard;
import pageclass.com.LoginPage;
import pageclass.com.TimesheetModule;
import utilclass.BaseClass;

public class Senario extends BaseClass{
	static LoginPage loginPage = null;
	static DashBoard dashBoard = null;
	static CandidateModule candidateModule = null;
	static TimesheetModule timesheetModule = null;
	@Test
	public void uday() throws InterruptedException {
		
		
			launchApplication();
			loginPage = new LoginPage();
			loginPage.login("uday.g+ola@ceipal.com", "Uday@2345");
			dashBoard = new DashBoard();
			dashBoard.popupClose();
			//dashBoard.clickMenuBar();
		//	dashBoard.clickCandidate();
			//candidateModule = new CandidateModule();
			//candidateModule.verifyHeader("Candidates");
			//candidateModule.candidateModuleGlobalSearch("Work Order1");
			//candidateModule.clickCreateButton();
//			candidateModule.fillCandidateForm();
//			candidateModule.clickSaveButton();
			//candidateModule.verifyToastMesg("Invalid URL Format");
		//	Thread.sleep(2000);
			dashBoard.clickMenuBar();
			dashBoard.clickTimesheet();
			timesheetModule=new TimesheetModule();
			timesheetModule.missingTimesheetCountButton();
			timesheetModule.missingTimesheetCount();
			timesheetModule.selectWorkerDropdown();
			

	}

}
