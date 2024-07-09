package lk.Ijse.pharmAssist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeAttendance {
    private int EMPLOYEE_NUMBER;
    private Date DATE;
    private Time START_TIME;
    private Time END_TIME;
    private double PAY_FOR_HOUR;
}
