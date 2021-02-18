package io.github.Wafilh0.DeskHelp.api.enums;

public enum StatusEnum {

	New,
	Assigned,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	public static StatusEnum getStatus(String status) {
		return StatusEnum.valueOf(status);
	}
	
}
