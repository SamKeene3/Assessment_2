package com.qa.persistence.domian;

public class ClassManagement {
	
	private Long 	classRoomId;
	private String 	trainer; 
	private String	trainee;
	private Long	traineeID;
	private String	traineeName;
	
	
	public ClassManagement() {
		
	}
	
	public ClassManagement( String 	trainer, String trainee) {
		super();
		
		this.trainer = trainer;
		this.trainee = trainee;
		
	}

	public Long getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(Long classRoomId) {
		this.classRoomId = classRoomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public Long getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public String getTrainee() {
		return trainee;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}
	

}
