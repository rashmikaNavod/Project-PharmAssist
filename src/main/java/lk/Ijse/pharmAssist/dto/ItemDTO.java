package lk.Ijse.pharmAssist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO {
    private String CODE;
    private String DESCRIPTION;
    private double UNIT_PRICE;
    private int QTY_ON_HAND;

}
