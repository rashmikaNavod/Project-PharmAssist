package lk.Ijse.pharmAssist.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MedicineTM {
    private String NAME;
    private String BRAND;
    private double UNIT_PRICE;
    private int QTY;

}
