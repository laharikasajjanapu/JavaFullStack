package com.languagefundamentals;

public class BugTracker {
	
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugId() {
		return bugId;
	}
	
	String getApplicationName() {
		return applicationName;
	}
	
	String getBugTitle() {
		return bugTitle;
	}
	
	String getSeverity() {
		return severity;
	}
	
	String getPriority() {
		return priority;
	}
	
	String getStatus() {
		return status;
	}
	
	String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	void assignToDeveloper(int bugId,String assignedDeveloper) {
		this.bugId=bugId;
		this.assignedDeveloper=assignedDeveloper;
		updateStatus("In Development");
	}
	
	void updateStatus(String newStatus) {
		status=newStatus;
	}
	
	void displayBugSummary(){
		System.out.println("Bug   Id           :  " + getbugId());
		System.out.println("Application Name   :  " + getApplicationName());
		System.out.println("Bug   Title        :  " + getBugTitle());
		System.out.println("Severity           :  " + getSeverity());
		System.out.println("Priority           :  " + getPriority());
		System.out.println("Current Status     :  " + getStatus());
		System.out.println("Assigned Developer :  " + getAssignedDeveloper());
	}

	public static void main(String[] args) {
		BugTracker b1=new BugTracker();
		b1.bugId=10234;
		b1.applicationName="Shopping";
		b1.bugTitle="Payment Error";
		b1.severity="High";
		b1.priority="Urgent";
		b1.status="Closed";
		b1.assignedDeveloper="Laharika";
		System.out.println();
		b1.assignToDeveloper(10366, "Vennela");
		b1.displayBugSummary();

	}

}
