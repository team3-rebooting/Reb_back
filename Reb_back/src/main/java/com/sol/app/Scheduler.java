package com.sol.app;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import com.sol.app.course.dao.CourseListDAO;
import com.sol.app.course.dao.FileCourseDAO;
import com.sol.app.dto.CourseListDTO;
import com.sol.app.dto.RoutineListDTO;
import com.sol.app.routine.dao.RoutineListDAO;

import static java.time.LocalDateTime.now;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Scheduler {
	public static final String SEOUL_ZONE = "Asia/Seoul";
	public static final int ONE_DAY = 1;
	public static final int ONE_DAY_AS_SECOND = 24 * 60 * 60;
	public static final int SINGLE_POOL_SIZE = 1;

	private final ScheduledExecutorService scheduler;

	public Scheduler() {
		this.scheduler = Executors.newScheduledThreadPool(SINGLE_POOL_SIZE);
		
		System.out.println("Scheduler 생성자 호출");
		init();
	}

	private void init() {
		CourseListDAO courseListDAO = new CourseListDAO();
		List<CourseListDTO> courseListDTO = courseListDAO.selectAll();

		if (courseListDAO != null) {
			for (CourseListDTO c : courseListDTO) {
				int originNumber = c.getCourseRecruitStatusNumber();
				c.setCourseRecruitStatusNumber();
				courseListDAO.updateStatus(c);

				System.out.println("course " + c.getCourseNumber() + " : " + originNumber + "->"
						+ c.getCourseRecruitStatusNumber());
			}
		}

		RoutineListDAO routineListDAO = new RoutineListDAO();
		List<RoutineListDTO> routineListDTO = routineListDAO.selectAll();

		if (routineListDTO != null) {
			for (RoutineListDTO r : routineListDTO) {
				int originNumber = r.getRoutineStatusNumber();
				
				r.setRoutineStatusNumber();
				routineListDAO.updateStatus(r);
				
				System.out.println("course " + r.getRoutineNumber() + " : " + originNumber + "->"
						+ r.getRoutineStatusNumber());
			}
		}
	}

	// public void execute(Runnable command, int hour, int minute, int second) {
	public void execute(int hour, int minute, int second) {
		ZonedDateTime now = ZonedDateTime.of(now(), ZoneId.of(SEOUL_ZONE));
		ZonedDateTime nextExecutionTime = this.getNextExecutionTime(hour, minute, second, now);
		scheduler.scheduleAtFixedRate(() -> init(), this.getInitialExecutionTime(now, nextExecutionTime),
				ONE_DAY_AS_SECOND, SECONDS);
	}

	private ZonedDateTime getNextExecutionTime(int hour, int minute, int second, ZonedDateTime now) {
		ZonedDateTime nextExecutionTime;
		nextExecutionTime = now.withHour(hour).withMinute(minute).withSecond(second);

		if (this.isOverDay(now, nextExecutionTime))
			nextExecutionTime = nextExecutionTime.plusDays(ONE_DAY);

		return nextExecutionTime;
	}

	private boolean isOverDay(ZonedDateTime zonedNow, ZonedDateTime nextExecutionTime) {
		return zonedNow.compareTo(nextExecutionTime) > 0;
	}

	private long getInitialExecutionTime(ZonedDateTime now, ZonedDateTime nextExecutionTime) {
		Duration duration = Duration.between(now, nextExecutionTime);
		return duration.getSeconds();
	}
}