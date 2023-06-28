package HW3Java3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private String surnameOfAuthor;
    private Integer price;
    private Integer year;
    private Integer pagesCount;

    public Boolean primePagesCount() {
        if (pagesCount == 0 || pagesCount == 1)
            return false;
        if (pagesCount == 2 || pagesCount == 3 || pagesCount == 5 || pagesCount == 7)
            return true;
        for (int i = 2; i < pagesCount; i++) {
            if (pagesCount % i == 0)
                return false;
        }
        return true;
    }
}
