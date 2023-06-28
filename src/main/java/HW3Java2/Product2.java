package HW3Java2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product2 {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer cultivar;
}
