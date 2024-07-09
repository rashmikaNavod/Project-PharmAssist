package lk.Ijse.pharmAssist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeAttendanceDTO {
    private int EMPLOYEE_NUMBER;
    private Date DATE;
    private Time START_TIME;
    private Time END_TIME;
    private double PAY_FOR_HOUR;
}
