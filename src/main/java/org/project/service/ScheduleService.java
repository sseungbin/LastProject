package org.project.service;

import java.time.LocalDate;

import org.project.domain.ScheduleVO;

public interface ScheduleService {
	
	public ScheduleVO getCategory(String genre);

	public int getMusical();
	
	public int getConcerts();
	
	public String genre();

}
