package lk.Ijse.pharmAssist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MedicineDTO {
    private String NAME;
    private String BRAND;
    private double UNIT_PRICE;
    private int QTY;

}
