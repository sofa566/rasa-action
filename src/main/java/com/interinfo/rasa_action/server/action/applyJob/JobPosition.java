package com.interinfo.rasa_action.server.action.applyJob;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class JobPosition {

	private List<Job> jobs;

	public JobPosition(List<Job> jobs) {
		super();
		this.jobs = jobs;
	}

	public JobPosition() {
		super();
		// TODO Auto-generated constructor stub
	}
}

