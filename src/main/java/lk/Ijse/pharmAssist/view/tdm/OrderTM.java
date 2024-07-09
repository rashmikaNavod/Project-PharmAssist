package lk.Ijse.pharmAssist.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderTM {
    private String ORDER_ID;
    private Date DATE;
    private int EMP_NUMBER;
    private int CUS_NUMBER;
}
