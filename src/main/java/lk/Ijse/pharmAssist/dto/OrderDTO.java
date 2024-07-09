package lk.Ijse.pharmAssist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO {
    private String ORDER_ID;
    private Date DATE;
    private int EMP_NUMBER;
    private int CUS_NUMBER;
}
