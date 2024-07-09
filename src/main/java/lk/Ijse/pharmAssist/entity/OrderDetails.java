package lk.Ijse.pharmAssist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails {
    private String ORDER_ID;
    private String ITEM_CODE;
    private String MEDICINE_NAME;
    private String MEDICINE_BRAND;
    private int QTY;
    private double UNIT_PRICE;
    private double TOTAL;
    private String WHAT_ITEM;

}
