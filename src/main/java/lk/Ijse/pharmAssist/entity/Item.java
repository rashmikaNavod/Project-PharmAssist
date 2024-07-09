package lk.Ijse.pharmAssist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private String CODE;
    private String DESCRIPTION;
    private double UNIT_PRICE;
    private int QTY_ON_HAND;

}
