package lk.Ijse.pharmAssist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Medicine {
    private String NAME;
    private String BRAND;
    private double UNIT_PRICE;
    private int QTY;

}
