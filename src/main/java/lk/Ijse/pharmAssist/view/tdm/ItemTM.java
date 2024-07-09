package lk.Ijse.pharmAssist.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemTM {
    private String CODE;
    private String DESCRIPTION;
    private double UNIT_PRICE;
    private int QTY_ON_HAND;

}
