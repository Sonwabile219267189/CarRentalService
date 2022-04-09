/*ScheduleFactory.java
 * ScheduleFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 7 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Schedule;
import za.ac.cput.Helper.GenerateID;

import java.time.LocalDateTime;

public class ScheduleFactory {

    public static Schedule createSchedule( LocalDateTime startTime, LocalDateTime endTime)
    {
        String sch = GenerateID.generateUUID();
        Schedule schedule= new Schedule.Builder()
                .setScheduleId(sch)
                .setVehicleId(sch)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .seUserId(sch)
                .build();

        return schedule;
    }

}

