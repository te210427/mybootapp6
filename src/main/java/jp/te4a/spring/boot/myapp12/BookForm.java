package jp.te4a.spring.boot.myapp12;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class BookForm {
    private Integer id;
    @NotNull
    @Size(min = 3)
    @TestValid(param = "abc")
    private String title;
    @Size(min = 3,max = 20)
    @Writer(ok = "東北タロウ")
    private String writer;
    private String publisher;
    @Min(0)
    private Integer price;   
}
