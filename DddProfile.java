package com.personal;

public class DddProfile implements IProfile{

	
	@Override
	public void myBasicInfo() {
		
		System.out.println("FirstName : Ddd");
		System.out.println("LastName : Ddd");
		System.out.println("Age : 21");
		
	}

	@Override
	public void myHobbies() {
		
		System.out.println("My hobby is listening music");
	}
	public static void main(String args[]){
		IProfile myProfile = new DddProfile();
	     TestProfile.printProfile(myProfile); 
	}
}
